package com.TestNo6;

public class Q5 {

	public static void main(String[] args) {
		
		String s="My name Is Mayank";
		String s1=s.toLowerCase();
		char [] arr=s1.toCharArray();
		
		
		boolean flag=false;
		int count=0;
		
	
		   
		   for(int i=0;i<arr.length;i++)
		   {
			  flag=false;
			  count=1;
			   for(int j=i-1;j>=0;j--)
			   {
				   if(arr[i]==arr[j])
				   {
					   flag=true;
				   }
				   
			   }
			   
			   if(flag==false)
			   {
				   for(int k=i+1;k<arr.length;k++)
				   {
					   if(arr[i]==arr[k])
					   {
						   System.out.println(arr[i]);
						   break;
					   }
				   }
			   }
		   }
		
		
	}

}
