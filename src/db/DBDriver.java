/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class DBDriver {
     public Statement st=null;
    public Connection con=null;
    public Statement getStatement(){
            
    try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fnsinfo","root","root");
            st=con.createStatement();
    }
    catch(Exception e){
            System.out.println("Exception is occured in DBDriver class: "+e);
    }
    return st;
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
