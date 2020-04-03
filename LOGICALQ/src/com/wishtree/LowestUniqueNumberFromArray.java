package com.wishtree;

import java.util.*;
import java.util.Scanner;

public class LowestUniqueNumberFromArray {
	


	public static void main(String[] args) {
		
		System.out.println("Enter the size of Array");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
	    
		ArrayList<Integer> list=new ArrayList<Integer>();
		int [] arr=new int[N];
		for(int i=0; i<N; i++){
			arr[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i:arr){
			map.put(i, map.getOrDefault(i, 0)+1);
		}
        
		for(Map.Entry<Integer,Integer> m:map.entrySet()) {
			if((int)m.getValue()==1) {
				list.add((int)m.getKey());
			}
		}
		if(list.isEmpty()) {
		  System.out.println("no unique Element present in array");
		 }
		else {
		int min=Integer.MAX_VALUE;
		for(int i=0; i<list.size(); i++) {
			if(min>list.get(i)) {
				min=list.get(i);
			}
		}
		 System.out.println(min);
	   }
		sc.close();
	}

}
