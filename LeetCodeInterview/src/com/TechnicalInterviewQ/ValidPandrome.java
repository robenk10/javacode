package com.TechnicalInterviewQ;

public class ValidPandrome {
	
	public static boolean validPalindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		/*StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		return (sb.toString().equals(str));*/
	}

	public static void main(String[] args) {
		
		String s="nitiN";
		System.out.println(validPalindrome(s.toLowerCase()));
		
		
		

	}

}
