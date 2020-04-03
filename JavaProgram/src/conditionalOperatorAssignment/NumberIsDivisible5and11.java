package conditionalOperatorAssignment;

import java.util.Scanner;

public class NumberIsDivisible5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.// Write a Java program to check whether a number is divisible by 5 and 11 or not 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to Check it is Divisible by 5 and 11");
		int num=sc.nextInt();

		//Using If Else
		if(num%5==0 )
			if(num%11==0)
			{
				System.out.println("Number is Divisible by 5 and 11");

			}
			else
			{
				System.out.println("Number is not divisible");
			}
		//Using Ternary

		String str1=(num%5==0 && num%11==0)?"Number is Divisible by 5 and 11":"Number is not Divisible by 5 and 11";
		System.out.println(str1);
	}

}
