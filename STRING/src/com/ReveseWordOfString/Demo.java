package com.ReveseWordOfString;

abstract public class Demo {

 public static void main(String[] args) {
		
	String s="Hello java";
		
		String s1[] =s.split(" ");
        
		for(int i=s1.length-1;i>=0;i--)
		{    
			String s3="";
			for(int j=0;j<s1[i].length();j++)
			{
				char c=s1[i].charAt(j);
				s3=s3+c;
			}
			
			System.out.print(s3+" ");
		}
	}
	
	abstract  void show()	;
   String s1="ram";
   
  
 

	}


class A extends Demo
{

	@Override
	void show() {
		System.out.println("hi");
		
		
	}
	
	
	
	}
	   



