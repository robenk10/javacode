package com.TechnicalInterviewQ;

import java.util.*;

public class MajarityOfElementInArray {
	
	public static void isMajority(int [] nums) {
		
		HashMap<Integer,Integer	> map=new HashMap<Integer, Integer>();
		/*for(int i:nums) {
			if(map.containsKey(i) && map.get(i)+1>nums.length/2) {
				System.out.print(i);
				break;
			}
			else {
				map.put(i, map.getOrDefault(i,0)+1);
			}
		}*/
		
	
		for(int i:nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		 }
	  int  max=map.values().stream().max(Integer::compare).get();
	  for(Map.Entry<Integer,Integer> m:map.entrySet()) {
		  if(m.getValue()==max) {
			  System.out.println(m.getKey());
		  }
	  }
	}

	public static void main(String[] args) {
		
		int [] arr= {1,2,1,2,3,1,4,5,3,1};
		isMajority(arr);

	}

}
