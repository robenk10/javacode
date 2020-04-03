package com.paintShop;

public class Color {
  
	String cname;
	int qty;
	
	
	public Color(String cname, int qty) {
		this.cname = cname;
		this.qty = qty;
	}
	
	
	@Override
	public int hashCode()
	{
		return this.qty;
	}
	
	@Override
	public boolean equals(Object o)
	{  
		Color c=(Color) o;
		if(this.cname.equals(c.cname))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}



	@Override
	public String toString() {
		return "Color [cname=" + cname + ", qty=" + qty + "]";
	}
	
	
	
}
