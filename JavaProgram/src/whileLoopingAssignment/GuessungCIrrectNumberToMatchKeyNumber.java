package whileLoopingAssignment;

import java.util.Scanner;

public class GuessungCIrrectNumberToMatchKeyNumber {

	public static void main(String[] args) {

		/*	write a program that takes a number as input from user. 
		The key number is 4 and the user enters single digit numbers. 
		Ask the user for a number till he gets the correct answer. 
		Then display the number of tries it took to guess the correct number.
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("Check The Number With key No::-");
		System.out.println();

        
		do
		{       
			int key_number=4;
			System.out.println("Enter the number::-");
			int num=sc.nextInt();

			if(num==key_number)
			{
				break;
			}
			else if(num<10)
			{
				System.out.println("Try Anothe Number");
			}
			else if(num>10)
			{

				System.out.println("Try Another Number");
			}
			else
			{   
				System.out.println("Try Another Number");
				
			}



		}while(true);
		
		 System.out.println("The Number is Match Sucessful");

	}	

}
