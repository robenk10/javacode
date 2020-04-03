package com.TechnicalInterviewQ;

public class BinaryNumberWithalternatingbit {

	public static boolean inBit(int n) {
		
		int last=n%2;
		StringBuffer string=new StringBuffer();
	    string.append(last);
		n>>=1;
		while(n>0) {
			int current=n%2;
			if(current==last) {
				return false;
			}
			string.append(current);
			last=current;
			n>>=1;;
		}
		System.out.print(string.reverse()+" ");
		return true;
	}
	
	public static void main(String[] args) {
		
		int n=2;
		System.out.println(inBit(n));	
	}
}
