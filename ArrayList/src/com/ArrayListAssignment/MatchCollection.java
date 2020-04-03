package com.ArrayListAssignment;

import java.util.ArrayList;

public class MatchCollection {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList();

		al.add("Red");
		al.add("blue");
		//al.add("yellow");
		al.add("royalblue");
		al.add("white");



		ArrayList<String> al1=new ArrayList();

		al1.add("Red");
		al1.add("blue");
		al1.add("royalblue");
		al1.add("white");

		System.out.println(al1.containsAll(al));


		ArrayList<Integer> a=new ArrayList();
		for(int i=0;i<10;i++)
		{
			a.add(i, i+1);
		}




		Object[] x =a.toArray();

		for(Object r:x)
		{
			System.out.println(r);
		}


		for(int i=0;i<al.size();i++)
		{   
			for(int j=i+1;j<al.size();j++)
			{  
				int m=al.get(i).compareTo(al.get(j));
				
				if(m<0)
				{

					String temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
                
				if(m>0)
				{

					String temp=al.get(j);
					al.set(j, al.get(i));
					al.set(i, temp);
				}



			}


		}
		System.out.println(al);





	}

}
