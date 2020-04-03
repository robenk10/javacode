package com.previousquetion;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertBinaryToDecimal {

	public static int decimalNumber(String num) {
		/*int sum = 0;
		int i;
		int cnt=0;
		while(num>0) {
			i=num%10;
			sum=sum+(int) (i*Math.pow(2,cnt));
			cnt++;
			num=num/10;
		}
		return sum;*/
		int n=Integer.parseInt(num, 2);
		return n;
	}
	public static void main(String[] args) {
		
		int n=10;
		String s=Integer.toBinaryString(n);
		System.out.println(s);
		System.out.println(decimalNumber(Integer.toString(n)));   
	}

}
