package com.previousquetion;

import java.util.*;

public class FirstNonReapeatingCharacter {

	public static char firstNon(String str) {
		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		for(char c:str.toCharArray()) {
			map.put(c,map.containsKey(c)?map.get(c)+1:1);	
		}
		for(Map.Entry<Character,Integer>m:map.entrySet()) {
			if(m.getValue()==1) {
				return (char) m.getKey();
			}
		}
		return '0';

	}

	public static void main(String[] args) {

		String s="rbebodarc";

		if(firstNon(s)=='0') {
			System.out.println("No unique character in given String ");
		}
		else {
			System.out.println(firstNon(s));
		}
	}

}
