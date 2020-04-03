package com.NumberFormatExceptiongenreted;

public class Ass19 {
      static String inputString="abcdsss";
	public static void main(String[] args) {
		try {
       int a=Integer.parseInt(inputString);
		}
         
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
