package Jdbc;

import java.sql.*;
import java.util.Scanner;

class SingletonJdbc{
	
	private static SingletonJdbc jdbc=null;
	
	private SingletonJdbc() {
		
	}
	
	public static SingletonJdbc getInstance() {
		if(jdbc==null) {
			return jdbc=new SingletonJdbc();
		}
		return jdbc;
	}
	
	
	public static Connection getConnection() throws SQLException {
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","admin");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return con;
	}
	
	public int insertData(int deptid,String deptName,String location) throws SQLException {
		
		Connection con=null;
		PreparedStatement pstm=null;
		int counter=0;
		try {
			con=this.getConnection();
			pstm=con.prepareStatement("insert into dept(deptid,deptname,deptLocation)values(?,?,?)");
			pstm.setInt(1, deptid);
			pstm.setString(2, deptName);
			pstm.setString(3, location);
			counter=pstm.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("Data is Not Inserted Yet");
		}
		finally {
			con.close();
			pstm.close();
		}
		return counter;
	}
	
	public void viewData() throws SQLException {
		
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet set=null;	
		
		
		try {
			con=this.getConnection();
			pstm=con.prepareStatement("select * from dept");
			set=pstm.executeQuery();
			while(set.next()) {
				System.out.println(set.getInt(1)+"  "+set.getString(2)+"  "+set.getString(3));
			}
		}
		catch(Exception e) {}
		
		finally {
			con.close();
			pstm.close();
			set.close();
			
		}
	}
}
public class SingletonMain {

	public static void main(String[] args) throws SQLException {

		SingletonJdbc jdbccall=SingletonJdbc.getInstance();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data deptid,deptName,deptLocation");
		
		jdbccall.insertData(sc.nextInt(), sc.next(), sc.next());
		jdbccall.viewData();

	}

}
