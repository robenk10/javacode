package com.TestNo7;

public class QuestonNo15 {

	public static void main(String[] args) {
		
		String s="java";
		String s1=s.toLowerCase();
		System.out.println(s1);
		
		char [] ch=s1.toCharArray();
		int a;
		int b;
		char ch1;
		String s2="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='y'||ch[i]=='z')
			{
				a=(int)ch[i]-24;
				ch[i]=(char)a;
			}
			else
			{
				b=(int)ch[i]+2;
				ch[i]=(char)b;
			}
		}
       
		for(int i=0;i<ch.length;i++)
		{
			ch1=ch[i];
			s2=s2+ch1;
		}
		
		System.out.println(s2);
	}

}
