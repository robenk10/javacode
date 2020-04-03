package com.TechnicalInterviewQ;

import java.util.HashSet;

public class RemoveAllVowelFromString {
	
	public static String Vowels(String s) {
		
		HashSet<Character> set = new HashSet();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		
		StringBuilder result=new StringBuilder();
		for(char c:s.toCharArray()){
			if(!set.contains(c)) {
				result.append(c);
			}
		}
		
		return result.toString();
	
	}

	public static void main(String[] args) {
		
		String s="RajaSotware";
		
		System.out.println(Vowels(s.toLowerCase()));
		

	}

}
