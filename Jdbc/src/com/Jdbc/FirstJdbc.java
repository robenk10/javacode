 
package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbc {

	public static void main(String[] args) {
	
		Connection con=null;
		Statement stm=null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			try {
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin");
				
		        stm=con.createStatement();
		        
		        stm.executeUpdate("delete from emp where ename = 'abhijit' ");
		        
		        
				
                rs=stm.executeQuery("select * from emp");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			try {
				con.close();
				stm.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
