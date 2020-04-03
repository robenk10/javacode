package com.MethodAssignments;

public class Cube {

int a;
	

	public void cube() {
		System.out.println(a*a+"The cube of a=11 is ");
		

	}
	public int cube1()
	{  
		int n=a*a*a;
		return n;
	}
	public void cube1(int x)
	{
		int ans=x*x*x;
		System.out.println(ans);
	}
	
	public int cube2(int x )
	{   
		return x*x*x;
	}



	public static void main(String[] args) {
		Cube sc=new Cube();
		
		
		sc.a=11;
		sc.cube();
		int s=sc.cube1();
		System.out.println(s);
	    sc.cube1(sc.a=5);
	    
	    int ans=sc.cube2(sc.a=9);
	    System.out.println(ans);

	}
		
	}

		