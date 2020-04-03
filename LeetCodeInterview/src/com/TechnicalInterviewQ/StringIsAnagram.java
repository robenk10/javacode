 package com.TechnicalInterviewQ;

import java.util.*;

public class StringIsAnagram {
	
	public static String isAnagram(String s ,String t)
	{ 
		if(s.length()!=t.length()){
			return "Not anagram";
		}
		
		int [] count=new int[26];
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)-'a']++;
			count[t.charAt(i)-'a']--;
		}
		for(int i:count){
			if(i!=0){
				return "Not Anagram";
			}
	  }
		return "Anagram";
	}

	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		System.out.println(isAnagram(("java").toLowerCase(),("aajv").toLowerCase()));

	}

}
