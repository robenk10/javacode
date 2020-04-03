package com.TechnicalInterviewQ;

import java.util.*;

public class RemoveDuplicateNumber {
  public static int isDuplicates(int [] nums) {
	  
	  int index=1;
	  for(int i=0; i<nums.length-1; i++) {
		  if(nums[i] != nums[i+1]) {
			  nums[index++]=nums[i+1];
		  }
	  }
	  System.out.println(Arrays.toString(nums));
	  return index;
	  
  }
	public static void main(String[] args) {
		
		int nums[] = {0,1,1,2,2,3,3,4};
		
		int n=isDuplicates(nums);
		for(int i=0; i<n ; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
