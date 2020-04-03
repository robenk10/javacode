package com.TechnicalInterviewQ;

import java.util.*;

public class FrogcrossingTheRiver {
 
	public static boolean canCross(int [] stones) {
		for(int i=3;i<stones.length; i++) {
			if(stones[i]>stones[i-1]*2)
			return false;
		}
		HashSet<Integer> stonepositions=new HashSet<>();
		for(int stone:stones) {
			stonepositions.add(stone);
		}
		int lastStone=stones[stones.length-1];
		Stack<Integer> positions=new Stack();
		Stack<Integer> jumps=new Stack();
		positions.add(0);
		jumps.add(0);
		while(!positions.isEmpty()) {
			int position =positions.pop();
			int jumpDistance=jumps.pop();
			for(int i=jumpDistance-1; i<=jumpDistance+1; i++) {
				if(i<=0) {
					continue;
				}
				
				int nextposition=position+i;
				if(nextposition==lastStone) {
					return true;
				}
				else if(stonepositions.contains(nextposition)){
					positions.add(nextposition);
					jumps.add(i);
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		int [] arr= {0,1,3,5,6,8,12,17};
		System.out.println(canCross(arr));
	}

}
