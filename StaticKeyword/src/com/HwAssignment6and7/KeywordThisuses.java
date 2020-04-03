package com.HwAssignment6and7;

public class KeywordThisuses { 

	int id;
	String name;
	float per;

	public void m1(int id,String name,float per)
	{   
		this.id=id;       //current class instance variable......
		this.name=name;
		this.per=per;
		m2();  //invoke current class method implicitly.....
	}
	public void m2()
	{
		System.out.println(id+" "+name+" "+per);

	}

	KeywordThisuses ()
	{   
		this(10);   //this() can used call constructer
		System.out.println("hiii...");
	}
	KeywordThisuses( int id)
	{   
		this.id=id;
		System.out.println(id);
	}

       KeywordThisuses( Demo t)
      {
    	  System.out.println("hhhhhahahha;");
      }


	public void m3(KeywordThisuses k)
	{
		System.out.println(k);
	}

	public void p()
	{
		KeywordThisuses t=new KeywordThisuses();
		System.out.println(t);
		m3(this);
	}
	
	
	KeywordThisuses show1()
	{
		/*KeywordThisuses th1=new KeywordThisuses();
		return th1;
	*/ 
		return this;
	}


}



