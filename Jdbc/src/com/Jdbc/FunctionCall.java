package com.Jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;



public class FunctionCall {

	public static void main(String[] args) {
	 Connection con=null;
     CallableStatement stm=null;
	 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","admin");
				
				System.out.println("sucess");
		    
				String query="{ ?= call My_function1(?,?)}";
				stm= con.prepareCall(query);
				//con.setCatalog("myschema");
				stm.registerOutParameter(1, java.sql.Types.INTEGER);
				
		 stm.setInt(2, 10);
		  stm.setInt(3, 40);
		  	//stm.setInt(1, 0);
	     	
	     	
		 stm.execute(); 
		 int s=stm.getInt(1);
		 System.out.println(s);
				
//				String s="{  call Myprocedure(?,?,?)}";
//				stm=con.prepareCall(s);
//				stm.setInt(1, 10);
//				stm.setInt(2, 15);
//				stm.registerOutParameter(3, Types.INTEGER);
//				stm.execute();
//				System.out.println(stm.getInt(3));
//				
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		finally
		{
			try {
				con.close();
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

	}

}
