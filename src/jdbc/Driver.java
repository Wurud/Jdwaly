package jdbc;

import java.sql.*;

public class Driver {
	public static void main (String[] args) {
		try {
			//Get connection to db
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdwaly", "root", "2635253Ab");

			//Create statment
			Statement myStat = con.createStatement();
			
			//Execute SQL query
			ResultSet myRs = myStat.executeQuery("select * from Course");
			
			while (myRs.next()) {
				System.out.println(myRs.getString("Name"));
			}
			
		}catch (Exception exce) {
			exce.printStackTrace();
		}
	}

}
