package com.TechnicalInterviewQ;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		int k=2;
		int [] n= {3,4,5,6,2,5,6,3,7};
		//Arrays.sort(n);
		
		int count=0;
		for(int i=0 ;i<n.length;i++) {
			
			for(int j=i+1; j<n.length; j++) {
				
				if(n[i]>n[j]) {
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(n));
		int index=n[n.length-k];
		System.out.println(n[index]);
		/*int k=2;
		int [] n= {5,5,6,4,3,2};
		PriorityQueue<Integer> minheap=new PriorityQueue();
		for(int i:n) {
			minheap.add(i);
			if(minheap.size() > k) {
				minheap.remove();
			}
		}
		int n1=minheap.remove();
		System.out.println(n1);*/
	}

}
