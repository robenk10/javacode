package com.Methods;

public class WithReturnWithPara {
	int a,b;
	
	public int add(int a,int b)
	{   
		
		return a+b;
		//int c=x+y ,return c;
	}
	
	
	public String add(int id ,String name)
	{
		return id+" "+name;
	}
	
	
	
	WithReturnWithPara add(WithReturnWithPara wp1)
	{
		System.out.println(wp1.a);
		wp1.a=50;
		return wp1;
	}
	

	public static void main(String[] args) {
		
		
		WithReturnWithPara wp=new WithReturnWithPara();
		
		int ans=wp.add(10, 20);
		System.out.println(ans +" return x+y");   //sysout(wp.add(10,20)
		
		
		String str=wp.add(123, "Hello");   
		System.out.println(str);
	 
	 //System.out.println(wp.add(111, "hi"));
		
		
		
		wp.a=10;
		wp.b=20;
		System.out.println(wp.add(wp.a, wp.b));
		
		
		WithReturnWithPara wp2=wp.add(wp);
		
		System.out.println(wp2);
		System.out.println(wp);
		
		
		
	}

}
