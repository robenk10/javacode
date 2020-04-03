package com.HashcodeEqual;

public class Emp{
  
	int sid;
	String sname;
	
	
	public Emp(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
	public int hashCode()
	{   
		//System.out.println("in hahcodes");
		return this.sid;
	}
	@Override
	public String toString() {
		return "Emp [sid=" + sid + ", sname=" + sname + "]";
	}
	public boolean equals(Object o)
	{  
		//System.out.println("in equals");
		Emp e=(Emp)o;
		if(this.sname.equals(e.sname))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
}
