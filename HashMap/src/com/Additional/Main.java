package com.Additional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   HashMap<Integer,Dept> hm=new HashMap<Integer, Dept>();
	   ArrayList<Student> al=null;
	   Dept d=null;
	   for(int i=0;i<1;i++)
	   {  
		   System.out.println("ENter the Student details");
		  al =new ArrayList<Student>();
		 
		   
		   for(int j=1;j<=4;j++)
		   {
			  
			 int  rollno=sc.nextInt();
			 String name=sc.next();
			 al.add(new Student(rollno,name));
		   }
		   
		   System.out.println("Enter the Dept Details");
		   
		   int id=sc.nextInt();
		   String name=sc.next();
		   d=new Dept(id,name,al);
		   
		   hm.put(id, d);
	   }
	   
	   
	   Set s=hm.entrySet();
	   
	   Iterator itr=s.iterator();
	   
	   while(itr.hasNext())
	   {
		  Map.Entry m=(Entry) itr.next();
		  
		  Integer i1=(Integer) m.getKey();
		  Dept d1=(Dept) m.getValue();
		
		System.out.println(i1+" "+d1.id+" "+d1.name+" "+d1.al);
		
		
		
	   }
		
	}

}
