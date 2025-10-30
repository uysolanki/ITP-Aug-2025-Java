package day30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingPreparedStatement2 {

	public static void main(String[] args) throws Exception
	{
		Connection connection=MySqlDatabaseConnection.getConnection();
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of Emps");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		System.out.println("Enter eno");
		int a=sc.nextInt();
		
		System.out.println("Enter ename");
		String b=sc.next();
		
		System.out.println("Enter salary");
		double c=sc.nextDouble();
		
		String query="insert into emp values(?,?,?)";
		
		ps=connection.prepareStatement(query);
		
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setDouble(3, c);
		
		int rows=ps.executeUpdate();
		
		System.out.println(rows + " records inserted");
		}
		ps.close();
		connection.close();

	}

}
