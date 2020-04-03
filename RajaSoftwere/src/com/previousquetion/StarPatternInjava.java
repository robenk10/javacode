package com.previousquetion;

public class StarPatternInjava {

	public static void main(String[] args) {
		
		
		int j=1;
		for(int i=1;i<9;) {
			if(j<=i) {
				System.out.print(i+" ");
				j++;
			}
			else if(j>=i) {
				j=1;
				i++;
				System.out.println();
			}
			
		}

	}

}
