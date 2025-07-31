/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friends_notes_system;


import db.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class EmailFetcher {
    public String getEmailAddress(String up_name){
        String email="";
        try{
            DBDriver db = new DBDriver();
             Statement st=db.getStatement();
            String query1="Select * from studentinfo where username= '"+up_name+"'";
            ResultSet rs=st.executeQuery(query1);
            if(rs.next()){
             email=rs.getString("email");
            
            }
            System.out.println("Email id:"+email);
            
        }catch(Exception e){
            System.out.println("Exception is occured in EmailFetcher in getEmailAddresss()"+e);
        }
        return email;
    }
    
}
