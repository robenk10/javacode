package com.ExtraBlankSpaces;

import java.util.Arrays;

public class BlankSpaces {

	public static void main(String[] args) {
		 
		String s="java   is      Langauge   Of       program";
		
		s=s.replaceAll("( )+"," ");
		System.out.println(s);
	}

}
