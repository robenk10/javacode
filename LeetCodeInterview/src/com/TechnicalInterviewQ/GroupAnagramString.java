package com.TechnicalInterviewQ;

import java.util.*;

public class GroupAnagramString {
	
	public static List<List<String>> groupAnagram(String[] str){
        
		List<List<String>> groupAna=new ArrayList();
		HashMap<String ,List<String>> map=new HashMap();
		
		for(String s:str) {
			char [] ch=s.toCharArray();
			Arrays.parallelSort(ch);
			String sorted=new String(ch);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList());
			}
        	map.get(sorted).add(s);	
		}
		
		groupAna.addAll(map.values());
		return groupAna;
	}

	public static void main(String[] args) {
		
		String str[] = {"eat" ,"tea","tan","ate","nat","bat"};
		
         System.out.println(groupAnagram(str));
	}

}
