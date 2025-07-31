/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friends_notes_system;

import db.DBDriver;
import static friends_notes_system.StudentOPFrame.studentname;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 *
 * @author HP
 */
public class UploadOP {
   public boolean isUploaded(String studentname, String filename, String discription, String date_time) {
    boolean flag = true;
    try {
        DBDriver db = new DBDriver();
        Statement st=db.getStatement();

       System.out.println("Inside isDataInfoStored() function ");
           
           String query = "INSERT INTO uploadinfo (username, filename, discription, date_time) VALUES ('" 
               + studentname + "','" + filename + "','" + discription + "','" + date_time + "')";

            System.out.println("Query : "+query);
            int x=st.executeUpdate(query);
            if(x>0)
            {
                flag=true;
                flag=true;
                db.st.close();
                db.con.close();
            }
    } catch (Exception e) {
        System.out.println("Exception in isUploaded(): " + e);
        flag = false;
    }
    return flag;
}


    public boolean isUploadedInfoCreated(){
         boolean flag=true;
        try{
            DBDriver db = new DBDriver(); // your database connection class
        Statement st = db.getStatement();

        String query = "CREATE TABLE IF NOT EXISTS uploadinfo ("
                     + "username VARCHAR(50) , "
                     + "filename VARCHAR(255) PRIMARY KEY, "
                     + "discription VARCHAR(45), "
                     + "date_time VARCHAR(45),"
                     + "filedata BLOB"
                     + ")";

        st.executeUpdate(query);
        System.out.println("Simple 'uploadInfo' table created successfully.");
        st.close();
        db.con.close();   
        }catch(Exception e){
            System.out.println("Exception is occured in UploadOP in method isUploadedInfoCreated()"+e);
            flag=false;
        }
        return flag;
    }
  public boolean isFileUploaded(File file) {
    boolean flag = true;
    try {
      flag=true; 
      
    } catch (Exception e) {
        System.out.println("Exception in isFileUploaded(): " + e);
        flag = false;
    }
    return flag;
  }
 
  public static String[][] getFileInfo()
    {
        String data[][] = null;
        try{
            DBDriver dbd =new DBDriver();
            Statement st1 = dbd.getStatement();
            Statement st2 = dbd.getStatement();
            String query = "select * from uploadinfo where username = '"+studentname+"'"; 
            System.out.println("StudentEditFrame.username: "+studentname);
            System.out.println("Query: "+ query);
            ResultSet rs1 = st1.executeQuery(query);
            ResultSet rs2 = st2.executeQuery(query);
            int row = 0;
            while(rs1.next())
                row++;
            data = new String[row][3];
            int i=0;
            while(rs2.next())
            {
                for (int j = 0; j < 3; j++) {
                    data[i][j] = rs2.getString(j+2);
                }
                i++;
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception at getFileInfo() in class UploadOP: "+e);
        }
        return data;
    }
 public boolean isFileInfoModified(String filename, String discription) {
    boolean flag = false;

    try {
        // Get username of current user (from login/session)
        String username = StudentOPFrame.studentname;

       

        // Connect to DB
        DBDriver db = new DBDriver();
        Statement st = db.getStatement();

        // Update the record based on filename and username
        String query = "UPDATE uploadinfo SET discription = '" + discription + "' " +
                       "WHERE username = '" + username + "' AND filename = '" + filename + "'";

        int x = st.executeUpdate(query);

        if (x > 0) {
            flag = true;
            System.out.println("File description updated successfully for: " + filename);
        } else {
            System.out.println("No record found to update for: " + filename);
        }

        st.close();
        db.con.close();

    } catch (Exception e) {
        System.out.println("Exception in isFileInfoModified(): " + e);
    }

    return flag;
}

}

 
//
