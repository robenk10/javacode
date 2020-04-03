package testOne;

import java.util.Scanner;

public class Ques_14 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,ch;
		System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Enter your Choice: ");
		ch = sc.nextInt();

		switch(ch)
		{
		case 1:
			System.out.println(a+b);
			break;

		case 2:
			System.out.println(a-b);
			break;

		case 3:
			System.out.println(a*b);
			break;

		case 4:
			System.out.println(a/b);
			break;

		case 5:
			System.out.println("Invalid Input");
			break;
		}
	}

}