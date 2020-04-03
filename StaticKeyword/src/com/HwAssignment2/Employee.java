package com.HwAssignment2;

public class Employee {
   
	int empId;
	String empName;
	float empSal;
	static int count = 0;
	
	public Employee(int empId, String empName, float empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	public void display()
	{
		System.out.println(empId+" "+empName+" "+empSal);
		totalnoemp();
		  
	}
	
	public static int  totalnoemp()
	{
	   
	   count++;
	   return count;
	  
	}

	public static void main(String[] args) {
		
       Employee e=new Employee(11,"amit",10000f);
       e.display();
       
     
       Employee e1=new Employee(12,"ajay",10500f);
       e1.display();
       
       Employee e2=new Employee(13,"alok",11000f);
       e2.display();
       
       
       Employee e3=new Employee(14,"ashwin",12000f);
       e3.display();
       
       
       
       Employee e4=new Employee(15,"amay",13000f);
       e4.display();
       
       System.out.println("total no of employee::"+  count);
      
     
       
	}

}
