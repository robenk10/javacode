package com.TestNo6;

public class Q17 {
 
	public String m(String s)
	{
		int n=s.lastIndexOf("is");
		int n1=s.indexOf("of");
		
		
		
		String s1=s.substring(n+2 , n1);
		return s1;
		
	}
	public static void main(String[] args) {
	     
		Q17 a=new Q17();
		String st="Avinash is a cricket player and he is a captain of the team";
		String s=st.toLowerCase();
		a.m(s);
		String s3=a.m(s);
		System.out.println(s3);

	}

}
 