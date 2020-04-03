package com.previousquetion;

import java.util.*;

public class DuplicateCharacterGivenString {
   
	public static void findDuplicate(String str) {
		int count=1;
		Map<Character ,Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			char current=str.charAt(i);
			map.put(current, map.containsKey(current)?map.get(current)+count:count);
		}
		for(Map.Entry<Character,Integer> m:map.entrySet())	{
		
			if(m.getValue()>1 ) {
				System.out.println("duplicate in java is = "+m.getKey()+":"+m.getValue());
			}
		}
	    
	}
	public static void main(String[] args) {
		
		String s="jaaaavv  jkjll ";
		
		findDuplicate(s);
	}

}
