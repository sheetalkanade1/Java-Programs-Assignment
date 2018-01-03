/*Write a program to make use of JDBC and insert/update/select values in the database.
 * 
 */
package com.sheetal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseInsert {
	    public static void main(String args[])
	    {
	        String name = "sheetal";
	        String email = "test@abc.com";
	         
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:Mysql@127.0.0.1:3306/test", "root", "root");
	            Statement stmt = con.createStatement();
	             
	            // Inserting data in database
	            String q1 = "insert into userid values('" +name+ "', '" +email+ "')";
	            int x = stmt.executeUpdate(q1);
	            if (x > 0)            
	                System.out.println("Successfully Inserted");            
	            else           
	                System.out.println("Try again to insert");
	             
	            con.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	}

