package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("com.mysql.cj.jdbc.Driver"); version 8.0.3
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpaugdb", "root", "");
		
		Statement st=connection.createStatement();
		
		String query="CREATE TABLE emp(\r\n"
				+ "eno int( 5 ) PRIMARY KEY ,\r\n"
				+ "ename varchar( 10 ) ,\r\n"
				+ "sal numeric( 6, 2 )\r\n"
				+ ");";
		
		st.execute(query);
		
		System.out.println("Table Created");
	
		st.close();
		connection.close();
		
	
	}
	
	
	

}



