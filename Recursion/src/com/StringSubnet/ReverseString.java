package com.StringSubnet;

public class ReverseString {
	static String s1="";
    public static String rec(String s)
    {
    	if(s1.length()==s.length())
    	{
    		return s1;
    	}
    	else
    	{
    		for(int i=s.length()-1;i>=0;i--)
    		{
    			char c=s.charAt(i);
    			s1=s1+c;
    		}
    		return rec(s1);
    	}
    	
    }
	public static void main(String[] args) {
	   
		String s="i love india";
		String s2=rec(s);
		System.out.println(s2);
		
	}

}
