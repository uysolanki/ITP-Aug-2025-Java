package day30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		Connection connection=MySqlDatabaseConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno");
		int a=sc.nextInt();
		
	
		
		String query="select ename,sal from emp where eno=?";
		
		PreparedStatement ps=connection.prepareStatement(query);
	
		ps.setInt(1, a);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next())
			System.out.println(rs.getString(1) + " " + rs.getDouble(2));
		
		rs.close();
		ps.close();
		connection.close();

	}

}
