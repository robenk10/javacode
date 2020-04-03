package com.TechnicalInterviewQ;

public class HammingDistance {

	public static void main(String[] args) {
		
		int x=1;
		int y=4;
		int result=0;
		while(x>0 || y>0) {
			
			result +=(x%2)^(y%2);
			x>>=1;
			y>>=1;
		}
		System.out.println(result);

	}

}
