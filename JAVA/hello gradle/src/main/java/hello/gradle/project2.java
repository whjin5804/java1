package hello.gradle;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class project2 {

	public static void main(String[] args) {

		Class.forName( "com.mysql.jdbc.Driver" );
		String dburl  = "jdbc:mysql://localhost/dbName";

		Connection con =  DriverManager.getConnection ( dburl, ID, PWD );
		
	}

}
