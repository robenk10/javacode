package com.previousquetion;

import java.util.*;

public class StringisAnagramorNot {

	public static void main(String[] args) {
		
		String s=("Java").toLowerCase();
		String s1=("aajva").toLowerCase();
		
		int result[] =new int[26];
				
		for(int i=0; i<s.length(); i++) {
			
			result[s.charAt(i)-'a']++;
			result[s1.charAt(i)-'a']--;
			
		}
		boolean flag=true;
		for(int c:result) {
			if(c!=0) {
				flag=false;
			}
		}
		if(flag==false) {
			System.out.println("NOt anagram");
		}
		else {
			System.out.println("anagram");
		}
		

	}

}
