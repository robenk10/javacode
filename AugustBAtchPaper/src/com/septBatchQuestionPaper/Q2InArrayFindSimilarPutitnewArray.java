package com.septBatchQuestionPaper;

import java.util.*;

public class Q2InArrayFindSimilarPutitnewArray {

	public static void main(String[] args) {

		int a[] = { 2, 5, 3, 2, 8, 1 };
		int b[] = { 7, 9, 5, 2, 4, 10 };
		int c[] = { 6, 7, 5, 5, 3 };

		Set<Integer> set = new HashSet<Integer>();
		for (int a1 : a) {
			set.add(a1);
		}

		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int a2 : b) {
			if (!set.add(a2))
			{
				set1.add(a2);
			}
				
		}
		for (int a3 : c) {
			if (!set.add(a3)) {
				set1.add(a3);
			}
				
		}
		
		System.out.println(set1);
		
	}

}
