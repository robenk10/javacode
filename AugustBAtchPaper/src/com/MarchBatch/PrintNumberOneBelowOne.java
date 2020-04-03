package com.MarchBatch;

public class PrintNumberOneBelowOne {

public	static int  recurs(int num) {
	    System.out.println(num);
	    if (num < 5) {
	        recurs(num + 1);
	    }
	   
	    else {
	    	 //System.out.println(num);
	    }
		return 0;
	}

	public static void main(String [] args) {
	    recurs(1);
	   
	}
	

}
