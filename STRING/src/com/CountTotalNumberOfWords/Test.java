package com.CountTotalNumberOfWords;

public class Test {

	public static void main(String[] args) {
		
		
		String s="Hello java Program I love Java coding";
		
        String [] s1=s.split(" ");
        
        int count=0;
        for(int i=0;i<s1.length;i++)
        {
        	
        	//System.out.println(s1[i]);
        	if(s1[i].isEmpty())
        	{
        		
        	}
        	else
        	{
        	count++;
        	}

        }
          System.out.println("Total Number Of Words in Given String  "+count);
	}

}
