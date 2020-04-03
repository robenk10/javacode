package com.HwAssignment2;
 class Emp {
	 static int empId;
		Emp()
		{
			empId++;
			System.out.println(empId);
		}
		
		public  int m1(int a)
		{
			return empId;
			
		}
		
		public int m1()
		{
			return empId;
		}
	}
	 
	 class programer extends Emp
	 {
			
			public  int m1(int a)
			{   
				this.empId=a;
				return empId;
				
			}
	 }
 
	
	
 public class Employee1

{
	public static void main(String[] args) {
		
		Emp e=new Emp();
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp e3=new Emp();
		//System.out.println(empId);
		int i=e.m1(13);
		System.out.println(i);
		
		Emp p=new programer();
		System.out.println(p.m1());
		System.out.println(p.m1(14));
		System.out.println(Emp.empId);
		
		

	}

}
