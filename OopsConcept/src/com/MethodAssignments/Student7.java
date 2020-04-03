package com.MethodAssignments;

public class Student7 {
	int id;
	float per;
	String name;
	public float percentage()
	{    
		int s1,s2,s3;
		float total,avg;
		s1=78;s2=70;s3=90;
		Mark(s1,s2,s3);
		total=s1+s2+s3;
		avg=total/3;
		
		per=(total/300)*100;
		return (float) per;
		
	}
	
	
	public void studentData(int ids ,float percent ,String names)
	{
		id=ids;
		per=percent;
		name=names;
	}
	
	
	public int Mark(int s1,int s2,int s3)
	{   
		int total=s1+s2+s3;
		return total;    
		
		
		
		
	}

	public static void main(String[] args) {
		
		
		Student7 s=new Student7();
		
		float percent=s.percentage();
		s.studentData(12, percent, "AAAJ");
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.per+" percentage");
		
		//System.out.println(s.Mark(100, 89, 90));
	}

}
