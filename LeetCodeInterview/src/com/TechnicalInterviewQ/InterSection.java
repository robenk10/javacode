package com.TechnicalInterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class InterSection {
	
	public static int[] interSection(int[] num1,int[] num2) {
		
		HashSet<Integer> set=new HashSet();
		for(int i:num1) {
			set.add(i);
		
		}
		HashSet<Integer> intersection=new HashSet();
		for(int i:num2) {
			if(set.contains(i)) {
				intersection.add(i);
				
			}
			set.add(i);	
		}
		int [] result=new int[intersection.size()];
		int index=0;
		for(int i:intersection) {
			
			result[index++]=i;
		}
		System.out.println("union are "+ set);
		return result;
	}

	public static void main(String[] args) {
		
		int arr[] = {4,1,5,6,8,2};
		int arr1[] = {4,6,5,3};
		ArrayList<Integer> list=new ArrayList();
		
        
		int [] a=interSection(arr,arr1);
		System.out.println("intersection are");
		for(int i:a) {
			System.out.print(i+ " ");
		}
	}

}
