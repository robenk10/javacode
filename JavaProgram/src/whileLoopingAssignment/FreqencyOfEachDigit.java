package whileLoopingAssignment;

import java.util.Scanner;

public class FreqencyOfEachDigit {

	public static void main(String[] args) {

		//Write a Java program to find frequency of each digit in a given integer.

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();

		int d,cnt=0,i=0;
		int numb=num;

		while(i<=9)
		{
			numb=num;
			cnt=0;
			while(numb>0)
			{
				d=numb%10;
				if(d==i)
				{
					cnt++;
				}
				numb=numb/10;
			}
			
			if(cnt>0)
			{
				System.out.println(i+ " " +cnt);
			}

			i++;
		}




	}

}