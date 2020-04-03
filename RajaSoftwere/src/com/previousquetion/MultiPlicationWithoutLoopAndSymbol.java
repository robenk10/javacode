package com.previousquetion;

public class MultiPlicationWithoutLoopAndSymbol {

	public static int multiply(int a, int b) {
		
		if(b==0) {
			return b;
		}
		
		return a+multiply(a,b-1);
	}
	public static void main(String[] args) {
		
		
		System.out.println(multiply(3,2));

	}

}
