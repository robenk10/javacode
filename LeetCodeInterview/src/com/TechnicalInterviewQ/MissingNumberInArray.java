package com.TechnicalInterviewQ;

import java.util.*;

public class MissingNumberInArray {

	public static void main(String[] args) {
	  
		int [] num= {0,1,2,8,6,10,4};
		Arrays.sort(num);
		//System.out.println(num[num.length-1]);
		Set<Integer> set=new HashSet();
        
		for(int i:num) {
			set.add(i);
		}
		for(int i=0; i<=num[num.length-1]; i++) {
			
			if(!set.contains(i)) {
				System.out.println("missing number is "+i);
			}
		}
	}

}
