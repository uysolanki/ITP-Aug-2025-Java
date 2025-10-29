package day30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		Connection connection=MySqlDatabaseConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno");
		int a=sc.nextInt();
		
		System.out.println("Enter ename");
		String b=sc.next();
		
		System.out.println("Enter salary");
		double c=sc.nextDouble();
		
		String query="insert into emp values(?,?,?)";
		
		PreparedStatement ps=connection.prepareStatement(query);
		
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setDouble(3, c);
		
		int rows=ps.executeUpdate();
		
		System.out.println(rows + " records inserted");
		
		ps.close();
		connection.close();

	}

}
