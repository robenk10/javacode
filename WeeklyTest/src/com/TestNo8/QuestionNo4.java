package com.TestNo8;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionNo4 {

	public static void main(String[] args) {
		ArrayList<Integer > al=new ArrayList<Integer>();
	    al.add(3);
	    al.add(5);
	    al.add(4);
	    al.add(2);
		
		for(int i=0;i<al.size();i++)
		{
			for(int  j=i+1;j<al.size();j++)
			{
				if(al.get(i)<al.get(j))
				{
					Integer temp=al.get(i);
					al.set(i, al.get(j));
					al.set( j, temp);
					
				}
			}
		}
		
		System.out.println(al);

	}

}
