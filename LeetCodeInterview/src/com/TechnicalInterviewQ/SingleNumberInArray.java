package com.TechnicalInterviewQ;

import java.util.HashSet;

public class SingleNumberInArray {
	
	public static int singleNumber(int [] num) {
		
		HashSet<Integer> set=new HashSet();
		for(int i:num) {
			if(!set.contains(i)) {
				set.add(i);
			}
			else {
				set.remove(i);
			}
		}
		for(int j:set) {
			return j;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,2,3,1,4,5,6};
		int a=singleNumber(arr);
		System.out.println(a);

	}

}
