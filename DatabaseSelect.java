package com.sheetal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseSelect {
	 public static void main(String args[])
	    {
	        String id = "id1";
	        String pwd = "pwd1";
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:Mysql@127.0.0.1:3306/test", "root", "root");
	            Statement stmt = con.createStatement();
	             
	            // SELECT query
	            String q1 = "select * from userid WHERE id = '" + id + 
	                                    "' AND pwd = '" + pwd + "'";
	            ResultSet re = stmt.executeQuery(q1);
	            if (re.next())
	            {
	              
	                System.out.println("Name :" + re.getString(3));
	                System.out.println("E-mail :" + re.getString(4));
	            }
	            else
	            {
	                System.out.println("no such ID is present");
	            }
	            con.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	
}
