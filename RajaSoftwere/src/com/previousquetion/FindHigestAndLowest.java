package com.previousquetion;



public class FindHigestAndLowest {
	
	

	public static void main(String[] args) {
		
		String str1="strsdfhhkhHhhings";
		String str=str1.toLowerCase();
	    
		int max=0;
		char result=' ';
		int [] count=new int[26];
		
		for(int i=0; i<str.length(); i++) {
			
			count[str.charAt(i)-'a']++;
		}
		
		for(int i=0; i<str.length(); i++) {
			
			if(count[str.charAt(i)-'a']>max) {
				max=count[str.charAt(i)-'a'];
				result=str.charAt(i);
			}
		}
			
		System.out.println(result+" "+max);
	
		

	}

}
