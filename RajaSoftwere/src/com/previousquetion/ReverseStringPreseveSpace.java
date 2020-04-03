package com.previousquetion;

import java.util.Arrays;

public class ReverseStringPreseveSpace {

	public static void main(String[] args) {
		
		String s="robin k";
		

		char[] ch=s.toCharArray();
		int k=0;
		char [] ch1=new char[ch.length];
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i]==' ') {
				ch1[i]=' ';
			}

			
		}
		for(int i=ch.length-1; i>=0; i--) {
			
			if(ch[i]!=' '){
				
				if(ch1[k]==' ') {
					k++;
				}
				ch1[k]=ch[i];
				k++;
			}
			
		}
		System.out.println(Arrays.toString(ch1));

	}

}
