package whileLoopingAssignment;

import java.util.Scanner;

public class IfToatalExceed500 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that takes the quantity of milk and oil as input from user.
		 * Milk is 40 rs. per liter and oil is 50 rs. per liter. Take the input from
		 * user till the total exceeds 500. If total exceeds 500 display the quantity of
		 * milk and oil entered.
		 */
		 
		 Scanner sc=new Scanner(System.in);
		 int qauntity_milk,qauntity_oil;
		 int milk_rate=40;
		 int oil_rate=50;
		 int milk_price=0,oil_price=0;
		 int total_exceed=0;
		 
		 do
		 {
			 System.out.println("Enter the qauntity Of milk");
			qauntity_milk=sc.nextInt(); 
			
			System.out.println("Enter the qauntity of oil");
			qauntity_oil=sc.nextInt();
			
			
			milk_price=qauntity_milk*milk_rate;
			
			oil_price=qauntity_oil*oil_rate;
			
			total_exceed=milk_price+oil_price;
			
			
			if(total_exceed>500	)
			{
				System.out.println("you have over excced amount " +total_exceed);
				break;
			}
			
		 }while(true);
		 
		
	}

}
