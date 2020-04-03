package com.TechnicalInterviewQ;

public class ReverseStringUsingWhileLoop {

	public static void main(String[] args) {
		
		String string="Robins";
	
		char [] character=string.toCharArray();
		int i=0;
		int j=character.length-1;
		while(i<j) {
			char temp=character[i];
			character[i++]=character[j];
			character[j--]=temp;
		}
		
		System.out.println(new String(character));

	}

}
