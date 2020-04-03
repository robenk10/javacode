package com.CountTotalNumberVOVANDCONST;

public class Demo {

	public static void main(String[] args) { 
		
		String s="sarkuotaautlsd";
		 
		String s1="";
		String s2="";
		int count=0;
		int count1=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='o')
            {
            	   char c=s.charAt(i);
            	   s1=c+s1;
            	   count++;
            }
			else
			{  
				char d=s.charAt(i);
				s2=d+s2;
				count1++;
			}
		}
		
		System.out.println("Vowels Are::"+s1+" "+count);
		System.out.println("Consonant are::"+s2+" "+count1);
		

	}

}
