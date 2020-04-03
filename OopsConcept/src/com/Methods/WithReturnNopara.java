package com.Methods;

public class WithReturnNopara {
	int x=4;
	int y=5;
	int z;
	int add()
	{   
		return z=x+y;  //It return back where method calls
	}
	
	int add1()
	{
		float a=x+y;
		return (int) a;
	}
	float add2()
	{
		z=x+y;
		return z;
	}
	
	public void disp()
	{
		
		x=9;
		System.out.println(add());
		int d=add();
		System.out.println(d+" IN The disp Method");
	}  
	
	WithReturnNopara show()
	{
		WithReturnNopara np1=new WithReturnNopara();
		return np1;
	}


	public static void main(String[] args) {
		 
		
		WithReturnNopara np=new WithReturnNopara();
		int ans=np.add();   //It accept Integer Type value
		System.out.println(ans+"  00");
		
		int ans1=np.add1();
		System.out.println(ans1+ " with add1 method");
		
		
		int ans3=(int) np.add2();
		System.out.println(ans3+" with add2 float return");
		
		
		np.disp();
		
		WithReturnNopara ad=np.show();
		System.out.println(ad);
		System.out.println(np);

	}

}
