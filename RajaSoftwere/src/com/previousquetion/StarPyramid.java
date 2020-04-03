package com.previousquetion;

public class StarPyramid {

	public static void main(String[] args) {
		
	
		int j=5;
		int i=0;
		int m=0;
		int k=0;
		while(k<5) {
			
			/*if(i<=k) {
				System.out.print("  ");
				i++;
			}*/
			if(j>k) {
				System.out.print(" ");
				j--;
			}
			else if(i<=k) {
				System.out.print("@ ");
				i++;
				
			}
			
			 else  if(i>=k) {
			    	i=0;
			        j=5;
			    	k++;
			    	System.out.println();
			    }
			
		}
	}

}
