package friends_notes_system;

import db.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DownloadData {

    public boolean isFileDownloadedfromAWS(String filename) {
        boolean flag = false;
        try {
            // Simulate AWS download success
            flag = true;
        } catch (Exception e) {
            System.out.println("Error while downloading: " + e);
        }
        return flag;
    }

    public String getUploadedUserByFilename(String filename) {
        String uploadedUser = null;
        try {
            DBDriver db = new DBDriver();
            Statement st = db.getStatement();

            String query = "SELECT username FROM uploadinfo WHERE filename = '" + filename + "' LIMIT 1";
            System.out.println("Query to get uploaded user: " + query);

            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                uploadedUser = rs.getString("username");
            } else {
                System.out.println("⚠️ No matching filename found in uploadinfo table");
            }

        } catch (Exception e) {
            System.out.println("❌ Exception in getUploadedUserByFilename(): " + e);
        }
        return uploadedUser;
    }

    public boolean isFileDownload(String filename) {
        boolean flag = false;

        if (isFileDownloadedfromAWS(filename)) {
            try {
                String file_uploaded_user = getUploadedUserByFilename(filename);
                Date dt = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
                String date_time = sdf.format(dt);

                if (file_uploaded_user != null && !file_uploaded_user.isEmpty()) {
                    System.out.println("Uploaded By: " + file_uploaded_user);

                    boolean inserted = isDownloadInfoInserted(StudentOPFrame.studentname, filename, file_uploaded_user, date_time);

                    if (inserted) {
                        String emailid = new EmailFetcher().getEmailAddress(file_uploaded_user);
                        String subject = "Vote of Thanks from Friends Notes System";

                        String msg1 = "Dear " + file_uploaded_user + ",\n\nThe file \"" + filename + "\" that you uploaded has been downloaded successfully by " + StudentOPFrame.studentname + ".";
                        String msg2 = "\n\nThanks and Regards,\nFriends Notes System.";
                        String finalmessage = msg1 + msg2;

                        SendEmail se = new SendEmail();
                        se.sendMailNow(finalmessage, subject, emailid);

                        flag = true;
                    }
                }

            } catch (Exception e) {
                System.out.println("❌ Exception in isFileDownload(): " + e);
            }
        }

        return flag;
    }

    public boolean isDownloadInfoInserted(String currentuser, String filename, String file_uploaded_user, String date_time) {
        boolean flag = false;
        try {
            DBDriver db = new DBDriver();
            Statement st = db.getStatement();

            String createTableQuery = "CREATE TABLE IF NOT EXISTS download_history (" +
                    "user_name VARCHAR(255), " +
                    "filename VARCHAR(100), " +
                    "file_uploaded_user VARCHAR(100), " +
                    "date_time VARCHAR(100))";
            st.executeUpdate(createTableQuery);

            String insertQuery = "INSERT INTO download_history VALUES('" + currentuser + "', '" + filename + "', '" + file_uploaded_user + "', '" + date_time + "')";
            int result = st.executeUpdate(insertQuery);

            if (result > 0)
                flag = true;

        } catch (Exception e) {
            System.out.println("❌ Exception in isDownloadInfoInserted(): " + e);
        }

        return flag;
    }

    public ArrayList getDownloadInfo(String current_user) {
        ArrayList data = new ArrayList();
        try {
            DBDriver db = new DBDriver();
            Statement st = db.getStatement();

            String query = "SELECT * FROM download_history WHERE user_name='" + current_user + "'";
            System.out.println("Query is: " + query);

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                ArrayList row = new ArrayList();
                row.add(rs.getString("filename"));
                row.add(rs.getString("file_uploaded_user"));
                row.add(rs.getString("date_time"));
                data.add(row);
            }

        } catch (Exception e) {
            System.out.println("❌ Exception in getDownloadInfo(): " + e);
        }

        return data;
    }
}
