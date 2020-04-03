package com.previousquetion;

import java.util.*;

public class ArrayIncrementByOne {
	
	public static int[] incrementByOne(int [] array) {
		
		int index=array.length-1;
		array[index]=array[index]+1;
		
		for(int i=index;i>0&&array[i]>=10; i--) {
			array[i]=0;
        	array[i-1]=array[i-1]+1;
		}
		if(array[0]==10) {
			int [] resized=new int[array.length+1];
			resized[0]=1;
			return resized;
		}
		else {
		      return array;
		}
	}

	public static void main(String[] args) {
		int [] arr= {7,9,3,9};
		
		int [] array=incrementByOne(arr);
		System.out.println(Arrays.toString(array));
		

	}

}
