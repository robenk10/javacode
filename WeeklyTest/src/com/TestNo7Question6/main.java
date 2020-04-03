package com.TestNo7Question6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Emp [] e=new Emp[3];
		Emp e1=null;
		
		System.out.println("Enter the Details");
		for(int i=0;i<e.length;i++)
		{
			int g=sc.nextInt();
			String s=sc.next();
			int ss=sc.nextInt();
			
			e1=new Emp(g,s,ss);
			e[i]=e1;
			
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		String temp;

		
		for(int i=0;i<e.length;i++)
		{
			for(int j=i+1;j<e.length;j++)
			{
				if(e[i].sal<e[j].sal)
				{
					temp=e[i].name;
					e[i].name=e[j].name;
					e[j].name=temp;
				}
			}
		}
		
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
	}

}
