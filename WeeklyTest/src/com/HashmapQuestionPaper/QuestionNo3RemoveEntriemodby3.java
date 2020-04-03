package com.HashmapQuestionPaper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionNo3RemoveEntriemodby3 {
             
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		
		for(int i=1;i<=10;i++)
		{    
			Integer m=i;
			hm.put(i, m.toString());
		}
		
		
		//hm.remove(6);
		
		HashMap <Integer,String>hm2=new HashMap();
		for(Map.Entry m:hm.entrySet() ) {
		  
		       Integer i= (Integer) m.getKey();
		       String s=(String) m.getValue();
		     
		       
		       if(i%3!=0)
		       {
		    	   
		    	  // int k=(int) m.getKey();
			       //String s=m.getValue();
		    	   hm2.put(i,s);
		    	 
		       }
		}
		
		System.out.println(hm2);
		
		       
		    
	/*	Set s=hm.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m=(Entry) itr.next();
			
			int i=(int) m.getKey();
			
			if(i%3==0)
			{
				itr.remove();
			}
		}
		
		  
		   System.out.println(hm);*/
		  
		 
	}
		 
}	
		

	
	


	
	
