package com.TechnicalInterviewQ;

import java.util.*;

public class FirstUniqueCharacterInGivenString {

	
	public static char returnIndex(String s)
	{
		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			char current=s.charAt(i);
			if(!map.containsKey(current)) {
				map.put(current, i);
			}
			else {
				map.put(current, -1);
		 	}
		}
			int min=Integer.MAX_VALUE;
			for(Character c:map.keySet())
			{
				if((map.get(c)>-1)&&(map.get(c)<min)) {
					min=map.get(c);
				}
			}
			
			
			return s.charAt(min== Integer.MAX_VALUE?-1:min);
		
		 
	}
	public static void main(String[] args) {
      String s="javadjf";
	    System.out.println(returnIndex(s));
	 
	  
	
    
      
	}

}
