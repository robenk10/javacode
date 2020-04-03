package testOne;

import java.util.Scanner;

public class Ques_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n = sc.nextInt();
		
		if(n % 2 == 0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
		
	}
}
