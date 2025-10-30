package day30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingPreparedStatement3 {

	public static void main(String[] args) throws Exception
	{
		Connection connection=MySqlDatabaseConnection.getConnection();
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);
		
		
		String query="insert into emp values(?,?,?)";
		ps=connection.prepareStatement(query);
		
		
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
		
				
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setDouble(3, c);
		ps.addBatch();
		
		}
		
		int rows[]=ps.executeBatch();
		//0		1		2
		//1		1		1
		System.out.println(rows[0] + " records inserted");
		ps.close();
		connection.close();
	}

}
