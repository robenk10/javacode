package com.ArrayListWithoutGenericKeepPositionObject;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListWithoutGenericKeepPositionObject {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		
		al.add(11);
		al.add("Greeen");
		
		Iterator itr= al.iterator();
		int j=0;
		while(itr.hasNext())
		{   
			
			System.out.println("in  "+j+"  th  position::"+itr.next() );
			j++;
		}
        
		
		System.out.println();
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		for(Object e:al)
		{
			System.out.println(e);
		}
	}

}
