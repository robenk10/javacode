package com.junebatchlogical;

public class Questionno21 {

	public static void main(String[] args) {
		
	     char c='4';
	     int n=Character.getNumericValue(c);
	    
	     int size=2*n-1;
	     int a[][] =new int[size][size];
	     int f=0;
	     int b=size-1;
	     
	     while(n!=0)
	     {
	     for(int i=f;i<=b;i++)
	     {
	    	 for(int j=f;j<=b;j++)
	    	 {
	    		 if(i==f||i==b||j==f||j==b)
	    		 {
	    			 a[i][j]=n;
	    		 }
	    	 }
	     }
	     ++f;
	     --b;
	     --n;
	     }
	     
	     
	    
	     for(int i=0;i<size;i++)
	     {
	    	 for(int j=0;j<size;j++)
	    	 {
	    		 System.out.print(a[i][j]);
	    	 }
	    	 System.out.println();
	     }
	}

}
