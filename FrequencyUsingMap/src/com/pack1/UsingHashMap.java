package com.pack1;

import java.util.*;

public class UsingHashMap {


	int no;

	public static void m1(LinkedList<Integer> l) {
		int cnt;
		HashMap<String, Integer> hm = new HashMap();
		String numInWords = null;
		for (Integer i : l) {
			switch (i) {
			case 1:
				numInWords = "one";
				break;
			case 2:
				numInWords = "two";
				break;
			case 3:
				numInWords = "three";
				break;
			case 4:
				numInWords = "four";
				break;
			case 5:
				numInWords = "five";
				break;
			default:
				numInWords = "invalide";
			}
			if (hm.containsKey(numInWords))
			{
				cnt = hm.get(numInWords);
			}
			else
			{
				cnt = 0;
			}
			cnt = cnt+1;
			hm.put(numInWords, cnt);
		}
		System.out.println(hm);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // UsingHashMap d = new    UsingHashMap();
		LinkedList<Integer> l = new LinkedList();
		l.add(1);
		l.add(4);
		l.add(2);
		l.add(1);
		l.add(3);
		l.add(1);
		l.add(1);
		l.add(6);
		l.add(9);
		m1(l);
	}
}