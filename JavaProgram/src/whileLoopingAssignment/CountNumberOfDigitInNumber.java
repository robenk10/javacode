package whileLoopingAssignment;

import java.util.Scanner;

public class CountNumberOfDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int d,count=0;
        while(num!=0)
        {
        	d=num%10;
        	count++;
        	num=num/10;
        }
        System.out.println(count + " is total digit in number");
		
	}

}
