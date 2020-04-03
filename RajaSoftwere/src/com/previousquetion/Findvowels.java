package com.previousquetion;

import java.util.*;

public class Findvowels {
	
	public static HashMap<Character,Integer> isVowel(String s){
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		for(char c:s.toLowerCase().toCharArray()) {
			if(c=='a'|| c=='e'||c=='i'||c=='u'||c=='o') {
			map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		
		String s="rajasoOftware";
		
		System.out.println(isVowel(s));
		/*HashMap<Character,Integer> map=isVowel(s);
		map.forEach((K, V)->{
			System.out.println(K+ " "+ V);
		});*/
	}

}
