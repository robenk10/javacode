package com.TechnicalInterviewQ;

import java.util.*;

public class SortCharacterByfrequency {
	
	public static String isSort(String s) {
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);	
		}
			PriorityQueue <Character>queue=new PriorityQueue<Character>((a,b)-> map.get(b)-map.get(a));
			queue.addAll(map.keySet());
			System.out.println(queue);
		StringBuilder result=new StringBuilder();
		while(!queue.isEmpty()) {
			char current=queue.remove();
			for(int i=0; i<map.get(current); i++) {
				result.append(current);
			}
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		
		String s="RoboibbnR";
		System.out.println(isSort(s));
	}

}
