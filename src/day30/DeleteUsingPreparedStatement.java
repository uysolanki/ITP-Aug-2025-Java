package day30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {
public static void main(String[] args) throws Exception
{

	Connection connection = MySqlDatabaseConnection.getConnection();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter eno");
	int a=sc.nextInt();
	
	String query="delete from emp where eno=?";
	PreparedStatement ps=connection.prepareStatement(query);
	
	ps.setInt(1, a);
	
	try
	{
	int rows=ps.executeUpdate();
	
	System.out.println(rows + " Records Deleted");

	ps.close();
	connection.close();
	}
	catch(SQLException ex)
	{
		System.out.println(ex.getMessage());
	}
}
}
