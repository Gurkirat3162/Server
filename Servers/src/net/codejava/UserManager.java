package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;

public class UserManager {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		  			 try 
		  			 {
		  				 
		  				 	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		  				 	Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-UR1M3MH//MSSQL:1433;databaseName=Employee;integratedSecurity=true");
		  				 
		  				 if (con!=null)
		  				 {
		  					 
		  					 System.out.println("connected succesfully");
		  					 
		  				 }}
		  				 catch (SQLException ex)
		  				 {
		  					 System.out.println(ex);
		  					 
		  				 }
		  			 }
		}

	

