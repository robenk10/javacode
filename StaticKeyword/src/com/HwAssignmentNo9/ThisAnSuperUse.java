package com.HwAssignmentNo9;

 class  mm {
    int rollno;
    String name;
    
    static int id=0;
    
    public void go(int rollno ,String name)
    {   
    	id=10;
    	this.rollno=rollno;
    	this.name=name;
    }
    
    public static void m1(int rollno,String name)
    {   
    	id=11;
    	 mm m=new mm();
          m.rollno=rollno;
          m.name=name;
          System.out.println(m.rollno+" "+m.name);
          System.out.println(id);
    }
    
    
}

class child extends mm
{
	public void go(int rollno ,String name)
	{   super.go(rollno,name);
		System.out.println(super.rollno+" "+super.name);
		System.out.println("hi");
	}
}

public class ThisAnSuperUse
{
public static void main(String[] args) {
		
	    mm ts=new child();
    	ts.go(12, "ahhalkd");
    	mm.m1(100, "robin");
    	System.out.println(mm.id);
    	
	}
}