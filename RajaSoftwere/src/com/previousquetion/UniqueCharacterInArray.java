package com.previousquetion;

public class UniqueCharacterInArray {
	
	
	 static boolean areChractersUnique(String str) { 
	    
      for (int i = 0 ,j=i+1 ; i < str.length();) {
    	  
    	  //for(int j=i+1; j<str.length(); j++) {
    		  if(j<str.length()) {
    		  if(str.charAt(i)==str.charAt(j)) {
    			  return false;
    		  }
    		  j++;
    		 }
    		  else if(j>=str.length()) {
    			  i++;
    			  j=i+1;
    		  }
    	 // }
      }
      return true; 
  } 
    
  //driver code 
  public static void main (String[] args) 
  { 
      String s = "abcdabef"; 
        
      if (areChractersUnique(s)) 
          System.out.print("Unique"); 
      else
          System.out.print("Not Unique"); 
      
    
  } 
} 
