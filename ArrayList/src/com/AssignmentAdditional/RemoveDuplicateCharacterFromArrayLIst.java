package com.AssignmentAdditional;

import java.util.ArrayList;

public class RemoveDuplicateCharacterFromArrayLIst {

	public static void main(String[] args) {
		
		
		ArrayList<Character> al=new ArrayList();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		al.add('f');
		al.add('a');
		al.add('k');
		al.add('c');
		al.add(null);
		System.out.println(al);
		
		ArrayList<Character> al2=new ArrayList();
		al2.add('a');
		al2.add('b');
		al2.add('c');
		al2.add('d');
		al2.add('e');
		al2.add('f');
		al2.add('z');
		
		
		
	      al.clear();
	      al.removeAll(al2);
	      System.out.println(al2);
	      System.out.println(al);
	     
		
//		Character [] a=new Character[al.size()];
//	    boolean flag=false;
//		int counter=0;
//		
//		for(int i=0;i<a.length;i++)
//		{   
//			a[i]=al.get(i);
//			flag=false;
//			counter=1;
//			for(int j=i-1;j>=0;j--)
//			{   
//				a[j]=al.get(j);
//				if(a[i]==a[j])
//				{
//					flag=true;
//				}
//			}
//			
//			
//			
//			if(flag==false)
//			{
//				for(int k=i+1;k<a.length;k++)
//				{   a[k]=al.get(k);
//					if(a[i]==a[k])
//					{
//						counter++;
//					}
//				}
//				
//				
//			}
//			if(counter==1)
//			{
//				System.out.println(a[i]);
//			}
//			
//	  }
//		
		
		
		//Using Remove Method;
//		 int c = 0;
//		for(int i=0;i<al.size();i++)
//		{
//			for(int j=i+1;j<al.size();j++)
//			{
//				if(al.get(i).equals(al.get(j)))
//						{
//					      
//						   c++;
//					       al.remove(j);
//					       j--;
//						}
//			}
//			System.out.print(al.get(i)+" ");
//		}
//		

	}

}
