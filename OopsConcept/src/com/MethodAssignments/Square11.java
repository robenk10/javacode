package com.MethodAssignments;

public class Square11 {

	int a;
	

	public void square() {
		System.out.println(a*a+"The square of a=11 is ");
		

	}
	public int square1()
	{  
		int n=a*a;
		return n;
	}
	public void square1(int x)
	{
		int ans=x*x;
		System.out.println(ans);
	}
	
	public int square2(int x )
	{   
		return x*x;
	}



	public static void main(String[] args) {

		Square11 sc = new Square11();
		sc.a=11;
		sc.square();
		int s=sc.square1();
		System.out.println(s);
	    sc.square1(sc.a=5);
	    
	    int ans=sc.square2(sc.a=9);
	    System.out.println(ans);

	}

}
