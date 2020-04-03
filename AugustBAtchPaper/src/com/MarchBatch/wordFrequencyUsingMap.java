package com.MarchBatch;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class wordFrequencyUsingMap {

	public static void main(String[] args) {
		
		String str="Nothing is as easy as it looks Nothing ";
		
		String[] s=str.split(" ");
		
		Map <String ,Integer> map=new LinkedHashMap<String, Integer>();
		
		for(int i=0;i<s.length;i++)
		{
			if(map.containsKey(s[i])==false)
			{
				map.put(s[i], 1);
			}
			else
			{
				int oldval=map.get(s[i]);
				int newval=oldval+1;
				map.put(s[i], newval);
			}
		}
		Set<Map.Entry<String, Integer>> s2=map.entrySet();
		for(Map.Entry<String ,Integer> s1:s2)
		{
		    System.out.println(s1.getKey()+"="+s1.getValue());	
		}

	}

}
