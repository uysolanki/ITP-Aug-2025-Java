package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {
public static void main(String[] args) throws Exception
{

	Class.forName("com.mysql.jdbc.Driver");
	//Class.forName("com.mysql.cj.jdbc.Driver"); version 8.0.3
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpaugdb", "root", "");
	
	Statement st=connection.createStatement();
	
	String query="insert into emp values(2,'Ben',900.0)";
	try
	{
	int rows=st.executeUpdate(query);
	
	System.out.println(rows + " Records Inserted");

	st.close();
	connection.close();
	}
	catch(SQLException ex)
	{
		System.out.println(ex.getMessage());
	}
}
}
