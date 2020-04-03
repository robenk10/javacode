package com.ClassProgram;

public class A {

  static final int c;
	int a;
	
	static
	{   
		System.out.println("Robi");
		c=10;
	}
	
	{
		System.out.println("robin");
	}
	
	
	
	static void show(int a)
	{    
  
       
         
		// static int j=10;  cannot create local variable static....
		A obj=new A();

		obj.main();
		obj.a=a;;//cannot access non static variable in static method directly
		//but we can access it by creating object
		System.out.println(a);
		System.out.println("hi");
	}
	static int count;

	public void main()
	{    

		System.out.println(count);//count is static

	}
	
	

	A()
	{   
	     System.out.println("kedari");
		count++;
		System.out.println(count); //when it increases the count but it does not reinitialization bcoz it will get memory once 

	}
	
	static void show()
	{
		System.out.println("hello ");
	}


	public static void main(String[] args) {
		A a=new A();
		A a1=new A();
		A a2=new A();
		show(10);  // No need to object to call static method......
		a1.main();
		System.out.println(a.a); //every time a get new memory ......
		
		show();
		
		
		System.out.println(c);
	}
}


