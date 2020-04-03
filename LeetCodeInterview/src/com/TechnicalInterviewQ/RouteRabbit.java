package com.TechnicalInterviewQ;

import java.util.Arrays;
public class RouteRabbit {
	public static int solution(int N ,int K) {
         //step 1... 
		StringBuffer sb=new StringBuffer(Integer.toString(N));
		sb.reverse();
		int length=sb.length();
		int reverse=Integer.parseInt(sb.toString());
		if(reverse==N) {
			return 1;
		}
		else {
			//step 2...
			int arr[] =new int[length];
			int len=arr.length-1;
			int rem=0;
			while(N>0) {

				rem=N%10;
				arr[len--]=rem;
				N=N/10;	  
			}
             //step 3...
			for(int i=0; i<arr.length ; i++) {

				arr[i]=arr[i]*length;
			}
			

			  //STEP 4
			for(int i=0; i<arr.length; i++){
	             
	             int nums=arr[i];
	             int sum=0;
	             for(int prime=2; prime<nums; prime++) {
	            	 int count=0;
	            	 for(int check=2; check<prime; check++) {
	            		 if(prime%check==0) {
	            			 count++;
	            			 break;
	            		 } 
	            	 }
	            	 if(count==0) {
	            		int primesum=0;
	            		  primesum=(2*prime)+1;
	            		 if(primesum<nums) {
	            			 sum=sum+primesum;
	            		 }
	            	 }
	             }
                arr[i]=sum;
	        }
        
			
	       //step 5..   
	       int pairCount=0;
		   for(int i=0; i<arr.length; i++) {
			   for(int j=i+1; j<arr.length; j++) {
				   int pair=arr[i]+arr[j];
				   if(pair%K==0) {
					   pairCount++;
				   }
					   
				   }
			   }
		   return pairCount;

		}
		
	}


	public static void main(String[] args) {

		int N=46333;
		int K=3;

		System.out.println(solution(N,K));

	}

}
