/*Write a program to make use of JDBC and insert/update/select values in the database.
here we are attaempting to connect to local database
 * 
 */
package com.sheetal;

import java.sql.Connection;
import java.sql.DriverManager;

public class Databaseconnect 
	{
	    public static void main(String args[])
	    {
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	             
	            
	            Connection con = DriverManager.getConnection(
	             "jdbc:Mysql@127.0.0.1:3306/test", "root", "root");
	 
	            if (con != null)             
	                System.out.println("Connected");            
	            else           
	                System.out.println("Not Connected");
	             
	            con.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	}

