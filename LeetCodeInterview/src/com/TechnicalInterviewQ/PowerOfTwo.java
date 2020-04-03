package com.TechnicalInterviewQ;

public class PowerOfTwo {
   
	public static void main(String[] args) {
		int count = 0;
        int i=1;
        int n=8;
        while(i<n) {
        	i*=2;
        	count++;
        }
        if(i==n) {
        System.out.println("power of two are " + count);}
        else {
        	System.out.println("not valid number");
        }
	}

}
