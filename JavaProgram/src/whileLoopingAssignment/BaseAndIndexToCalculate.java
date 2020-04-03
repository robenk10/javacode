package whileLoopingAssignment;

import java.util.Scanner;

public class BaseAndIndexToCalculate {

	public static void main(String[] args) {
		
		//WAP to accept base and index from user and calculates power
		
		
		Scanner sc=new Scanner(System.in);
		int base,index;
		System.out.println("Enter the base and Index to calculate power::-");
		System.out.println();
		System.out.println("Enter the base ");
		base=sc.nextInt();
		System.out.println("Enter the Index");
		index=sc.nextInt();
		int product=1;
		while(index!=0)
		{
			product=product*base;
			index--;
		}
		System.out.println("The Power Of "+base +" is");
		System.out.println(product);
		
	}

}
