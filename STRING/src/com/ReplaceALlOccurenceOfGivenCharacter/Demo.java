package com.ReplaceALlOccurenceOfGivenCharacter;

public class Demo {

	public static void main(String[] args) {
		

		String s="aaotkjklsafjjhhtidhwa;asdfaa";
		System.out.println("before Replace \n"+s);
		
		 String s1=s.replaceAll(s, " ");
		 
		 System.out.println("After the Replace");
		 System.out.println(s1);
	}

}
