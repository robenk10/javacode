package com.previousquetion;

import java.util.*;

public class ConvertDecimalIntoBinaryFormat {

	
	public  static String isBinary(int num) {
		int i=0;
		/*StringBuffer s=new StringBuffer();
		while(num>0) {
			i=num%2;
			s.append(i);
			num=num/2;
		}
		return s.reverse().toString();*/
		
		return Integer.toBinaryString(num);
		
		
		
	}
	public static void main(String[] args) {
		
		int n=2;
		System.out.println(isBinary(n));
	
       
       
	}

}
