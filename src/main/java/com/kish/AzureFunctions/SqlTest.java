package com.kish.AzureFunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.microsoft.azure.functions.HttpStatus;

public class SqlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 try
//	        {
	        	    // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	              //   String url ="jdbc:sqlserver://kishoredb.database.windows.net:1433;database=kishoresqldb;user=kishadmin@kishoredb;password=Password@123;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
//	                //  Connection connect = DriverManager.getConnection(url);
//			 
//			
////					 String url ="jdbc:sqlserver://kishoredb.database.windows.net:3306/kishoresqldb?useSSL=true&requireSSL=false";
////			         Connection connect = DriverManager.getConnection(url, "kishadmin@kishoredb", "Password@123");
//	                 String sql="INSERT INTO dbo.data_trx(id,name,email,ssn) Values (?,?,?,?)";
//	                 PreparedStatement statement = connect.prepareStatement(sql);
//	                 statement.setInt(1, 1090);
//	                 statement.setString(2, "kishore");
//	                 statement.setString(3, "kk#gm.com");
//	                 statement.setString(4, "898989");
//	                 statement.execute();
//	                 }
//	                 catch(Exception e)
//	                 {
//	                 	e.printStackTrace();
//	                 }
	}

}
