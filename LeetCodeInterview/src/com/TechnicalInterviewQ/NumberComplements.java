package com.TechnicalInterviewQ;

public class NumberComplements {

	public static void main(String[] args) {
		
		int num=8;
		int result=0;
		int power=1;
		while(num>0) {
			result +=(num%2^1)*power;
			power<<=1;
			num>>=1;
		}
       System.out.println(result);
	}

}
