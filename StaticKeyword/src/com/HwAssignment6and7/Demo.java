package com.HwAssignment6and7;

public class Demo
{   
	public void show()
	{
		KeywordThisuses t1=new KeywordThisuses(this);
	}

	public static void main(String[] args) {

		KeywordThisuses th=new KeywordThisuses();
		th.m1(101, "ajay", 78);
		th.p();

		Demo d=new Demo();
		d.show();
          
		KeywordThisuses th3=th.show1();
		System.out.println(th3==th);

	}
}