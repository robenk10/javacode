package com.BookAuthorArrayLIstUsingGetterSetter;

public class Autor {
   
	int Authorid;
	String Authorname;
	
	
	public int getAuthorid() {
		return Authorid;
	}
	public void setAuthorid(int authorid) {
		Authorid = authorid;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
	@Override
	public String toString() {
		return "Autor [Authorid=" + Authorid + ", Authorname=" + Authorname + "]";
	}
	
	
	
	
}
