package com.TechnicalInterviewQ;

import java.util.*;

public class ReverseVowelInString {
	
	public static String vowelReverse(String s) {
		Set<Character> vowels=new HashSet<>();
		vowels.add('A');
		vowels.add('a');
		vowels.add('E');
		vowels.add('e');
		vowels.add('I');
		vowels.add('i');
		vowels.add('O');
		vowels.add('o');
		vowels.add('U');
		vowels.add('u');
		
		int i=0;
		int j=s.length()-1;
		char [] character=s.toCharArray();
		
		while(i<j) {
			if(i<j && !vowels.contains(character[i])){
				i++;
			}
			if(i<j && !vowels.contains(character[j])) {
				j--;
			}
			
			char temp=character[i];
			character[i++]=character[j];
			character[j--]=temp;
		}
		
		return new String(character);
		
	}

	public static void main(String[] args) {
		
		String str="rajaSOftworeO";
		
		System.out.println(vowelReverse(str));
		

	}

}
