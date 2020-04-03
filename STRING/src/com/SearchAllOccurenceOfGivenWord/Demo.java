package com.SearchAllOccurenceOfGivenWord;

public class Demo {

	public static void main(String[] args) {
		
	String s="java programmer java java programmer";
		
	

	String [] s1 =s.split(" ");
	boolean flag=false;

	int count = 0;
    int i;
	
	for( i=0;i<s1.length;i++)
	{   flag=false;
	    count=1;
	    String s2="";
	    String s3="";
	    String s4="";
	    
     
	    for(int j=0;j<s1[i].length();j++)
	    {
	    	
	    	s2=s2+s1[i].charAt(j);
	    }
	   
			
	     for(int m=i-1;m>=0;m--)
	     {
	    	 for(int k=0;k<s1[m].length();k++)
	    	 {
	    		 s3=s3+s1[m].charAt(k);
	    		 
	    		
	    		
		    	
	    	 }
	    	 if(s2.equals(s3))
	    	 {
	    		 flag=true;
	    	 }
	    	 s3="";
	    	
	    	
	     }
	    	
	    



	if(flag==false)
		{
			for (int k = i + 1; k < s1.length; k++) {
				
				for(int n=0;n<s1[k].length();n++)
				{
					s4=s4+s1[k].charAt(n);
					

				}
				if(s2.equals(s4))
				{
					count++;
				}
				s4="";
				
				
			}
			System.out.println(s1[i]+" "+count);

		}
	
	}
	


	}

}
