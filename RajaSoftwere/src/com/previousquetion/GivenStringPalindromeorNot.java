package com.previousquetion;

public class GivenStringPalindromeorNot {

	
	public static boolean isPalidrome(String str) {
		
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String s1=new String(sb);
		if(str.equalsIgnoreCase(s1)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String s="1nitin1";
		
		if(isPalidrome(s)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is Not Palindrome");
		}
	}

}
