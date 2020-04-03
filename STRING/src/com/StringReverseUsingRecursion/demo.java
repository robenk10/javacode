package com.StringReverseUsingRecursion;

public class demo {

	public static void main(String[] args) {
		
		 String blogName = "How";
         
	        String reverseString = reverseString(blogName);
	         
	        System.out.println(reverseString);
	        
	        String str="97";
	        int sum=0;
	        for(int i=0; i<str.length(); i++) {
	        	
	        	int n=Integer.valueOf(str.charAt(i));
	        	//System.out.println(n);
	        	sum=sum+((n+1)-49);
	        }
	        System.out.println(sum);
	}
	public static String reverseString(String string)
	    {
	        if (string.isEmpty()){
	         return string;
	        }
	        //Calling function recursively
	        return reverseString(string.substring(1))+ string.charAt(0);
	    }
	

}
