package com.Pixel;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");

		String s=sc.nextLine();

		String s1[] =s.split(" ");
		int printable=200;
		int j=0;
		int k=4;
		/*for(int i=0;i<s.length();i++)
		{ 
          if(k<80) {
			if(j<s1.length)
			{ 
				if((s1[j].length()*4)<printable)
				{ 
					System.out.print(s1[j]+" ");
					printable=printable-((s1[j].length()*4)+2);
				}
				else
				{
					System.out.println();
					printable=200;
					continue;	
				}
				j++;
			}
			k=k+4;
			
          }
          else {
        	  System.out.println();
        	  System.out.println();
        	  k=4;
        	  continue;
          }
		}*/
		
		int n=0;
		for(int i=0;i<s1.length;i++)
		{ 
          if(k<30) {
				if(n<printable){ 
					System.out.print(s1[i]+" ");
					n=n+((s1[i].length()*4)+2);
				}
				else{
					System.out.println();
				    n=0;
					continue;	
				}
			    k=k+4;
		 }
          else {
        	  System.out.println();
        	  k=4;
        	  continue;
          }
	}
		
		
		
	    
		/*int finallength=200;
		int j=0;
		int k=0;
		String [] str=s.split(" ");
		for(int i=0; i<str.length; i++) {
			 
			/*str="";
			if(j<finallength) {
				
				char c=s.charAt(i);
				str=str+c;
				
				System.out.print(str);
				if(s.charAt(i)==' ') {
					j=j+2;
				}
				else {
					j=j+4;
				}
			}
			else {
				System.out.println();
				j=0;
			}
		}*/
		sc.close();

	}

}
