package com.previousquetion;

import java.util.Arrays;

public class CandiesDistribution {
	
	public static int[] candy(int candy,int people) {
		
		int [] res=new int[people];
		
    	for(int i=0; candy>0; i++) {
			res[i%people] =Math.min(candy, i+1);
			candy -=i+1;
		}
		return res;
	}

	public static void main(String[] args) {
		
		int n=10;
		int p=4;
		int [] arr=candy(n,p);
		System.out.println(Arrays.toString(arr));

	}

}
