package com.sheetal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseUpdate {
	public static void main(String args[])
    {
        String id = "id1";
        String pwd = "pwd1"; 
        String newPwd = "newpwd";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:Mysql@127.0.0.1:3306/test", "root", "root");
            Statement stmt = con.createStatement();
         
            // Updating database
            String q1 = "UPDATE userid set pwd = '" + newPwd + 
                    "' WHERE id = '" +id+ "' AND pwd = '" + pwd + "'";
            int x = stmt.executeUpdate(q1);
             
            if (x > 0)            
                System.out.println("Password Successfully Updated");            
            else           
                System.out.println("check the error");
             
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}