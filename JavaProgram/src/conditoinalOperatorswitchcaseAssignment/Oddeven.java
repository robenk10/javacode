package conditoinalOperatorswitchcaseAssignment;
import java.util.*;
public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to check whether a number is even or odd using switchcase 
		
		
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int x=num%2;	
		switch(x)
		{
		case 0:
				System.out.println("even number");
				break;
	     default:
				System.out.println("odd number");
				break;
			     
		
		}
		
	}

}
