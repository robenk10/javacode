package com.AddElementToarrayListWithoutGeneric;

import java.util.ArrayList;
import java.util.Arrays;

public class WithoutGeneric {

	

	public static void main(String[] args) {
		  
		ArrayList al=new ArrayList();
		al.add("green");
		al.add(1);
		al.add(1.2f);
		al.add(123);
		al.add(55);
		
		String [] s=new String[al.size()];
		
		for(int i=0;i<al.size();i++)
		{
			s[i]=al.get(i).toString();
		}
		
		boolean flag=true;
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length();j++)
			{
				if(s[i].charAt(j)=='.'||s[i].charAt(j)>='a'&&s[i].charAt(j)<='z')
				{
					flag=false;
				}
			}
			
			if(flag==true)
			{
				System.out.println(s[i]);
			}
			
			flag=true;
		}
		
		
	
	  
	 

	}

}
