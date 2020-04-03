package com.junebatchlogical;

import java.util.*;

public class QuestionN08 {


	public static ArrayList<Number> getData()
	{  
		
			Integer myInt=Integer.valueOf(2);
         	Long myLong=Long.valueOf(2);
			Double myDouble=Double.valueOf(2.2);
			
			Number [] num= {myInt,myLong,myDouble};
			
			return new ArrayList <Number>(Arrays.asList(num));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println(getData());
			 
	}

}
