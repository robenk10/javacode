package com.HighestFRequencyOfCharacter;

public class Demo {

	public static void main(String[] args) {


		String s="aajmjaajbcjamajj";

		char [] ch=s.toCharArray();
		boolean flag=false;
		boolean flag1=false;

		int max1=0;
		int count1=0;

		int count = 0;
		char ch1=' ';
		char ch2=' ';
		int i;
		int max=0;
		for( i=0;i<ch.length;i++)
		{   flag=false;
		count=1;

		for(int j=i-1;j>=0;j--)
		{
			if(ch[i]==ch[j])
			{
				flag=true;
			}

		}


		if(flag==false)
		{
			for(int k=i+1;k<ch.length;k++)
			{
				if(ch[i]==ch[k])
				{
					count++;
				}

			}

			if(max<count)
			{
				max=count;
				ch1=ch[i];
			}

		}

		}
		//System.out.println(ch1+" "+max);
		
		
		for( i=0;i<ch.length;i++)
		{   flag1=false;
		count1=1;

		for(int j=i-1;j>=0;j--)
		{
			if(ch[i]==ch[j])
			{
				flag1=true;
			}

		}


		if(flag1==false)
		{
			for(int k=i+1;k<ch.length;k++)
			{
				if(ch[i]==ch[k])
				{
					count1++;
				}

			}

             if(max==count1)
			{
				System.out.println(ch[i]+" "+max);
			}
			
		}
		
		
		}


		
		



	}

}
