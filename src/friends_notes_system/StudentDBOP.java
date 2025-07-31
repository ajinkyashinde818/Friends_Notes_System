/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friends_notes_system;

import db.DBDriver;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class StudentDBOP {
    public boolean isStudentTableCreated(){
        boolean flag=true;
        try{
            DBDriver db=new DBDriver();
            Statement st=db.getStatement();
             
            String query = "CREATE TABLE IF NOT EXISTS studentinfo ("
                       + "id INT AUTO_INCREMENT PRIMARY KEY, "
                       + "name VARCHAR(100), "
                       + "dob VARCHAR(20), "
                       + "mobile VARCHAR(15), "
                       + "email VARCHAR(100), "
                       + "department VARCHAR(100), "
                       + "college VARCHAR(100), "
                       + "username VARCHAR(50) PRIMARY KEY, "
                       + "password VARCHAR(50), "
                       + "reg_date_time VARCHAR(30))";
            st.executeUpdate(query);
            flag=true;
        }catch(Exception e){
            System.out.println("Exception is occured in StudentDBOP in method isStudentTableCreated()"+e);
            flag=false;
        }
        return flag;
    }
    
    
    
     public boolean isDataInserted(String name, String dob, String mobile, String email, String dept,
                                  String college, String username, String password, String datetime) {
         boolean flag=true;
        try {
           DBDriver db=new DBDriver();
            Statement st=db.getStatement();
            String sql = "INSERT INTO studentinfo (name, dob, mobile, email, department, college, username, password, reg_date_time) "
                       + "VALUES ('" + name + "', '" + dob + "', '" + mobile + "', '" + email + "', '"
                       + dept + "', '" + college + "', '" + username + "', '" + password + "', '" + datetime + "')";
            int result = st.executeUpdate(sql);
            if(result > 0)
                flag=true;
            
        } catch (Exception e) {
            System.out.println("Exception is occured in StudentDBOP in method isDataInserted()"+e);
            flag=false;
        }
        return flag;
    }
    public boolean isStudentExisted(String username,String password){
        boolean flag=false;
        try{
            DBDriver db=new DBDriver();
            Statement st=db.getStatement();
            String query = "SELECT * FROM studentinfo WHERE username='" + username + "' AND Password='" + password + "'";
        
        System.out.println("Query is: " + query);

        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
            flag = true; 
        }
        
        }catch(Exception e){
            System.out.println("Exception is occured in StudentDBOP in method isStuentExisted()"+e);
        }
        return flag;
    }
     public ArrayList<String> getClientdata() {
        ArrayList<String> data = new ArrayList<>();
        //id, name, dob, mobile, email, department, college, username, password, reg_date_time
        try {
            DBDriver db = new DBDriver();
            Statement st = db.getStatement();
            String query = "SELECT * FROM studentinfo" ;
            System.out.println("Query is: " + query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                data.add(rs.getString("id"));   // 1
                data.add(rs.getString("name"));       // 2
                data.add(rs.getString("dob"));        // 3
                data.add(rs.getString("mobile"));     // 4
                data.add(rs.getString("email"));      // 5
                data.add(rs.getString("department"));   // 6
                data.add(rs.getString("college"));
                data.add(rs.getString("username"));
                data.add(rs.getString("password"));
                 data.add(rs.getString("reg_date_time"));
                 
            }
            rs.close();
            st.close();
            db.con.close();
        } catch (Exception e) {
            System.out.println("Exception occurred in getClientdata(): " + e);
        }
        return data;
    }
    public boolean isStudentEdited(String name, String dob, String mobile, String email,
                               String department, String college, String password, String username) {
    boolean isUpdated = false;
    try {
        DBDriver db = new DBDriver(); // assume this connects and provides Statement
        Statement st = db.getStatement();

        String query = "UPDATE studentinfo SET "
                     + "name='" + name + "', "
                     + "dob='" + dob + "', "
                     + "mobile='" + mobile + "', "
                     + "email='" + email + "', "
                     + "department='" + department + "', "
                     + "college='" + college + "', "
                     + "password='" + password + "' "
                     + "WHERE username='" + username + "'";

        System.out.println("Update Query: " + query);

        int rowsAffected = st.executeUpdate(query);
        if (rowsAffected > 0) {
            isUpdated = true;
        }

        st.close();
        db.con.close();
    } catch (Exception e) {
        System.out.println("Exception in isStudentEdited(): " + e);
    }
    return isUpdated;
}
}
