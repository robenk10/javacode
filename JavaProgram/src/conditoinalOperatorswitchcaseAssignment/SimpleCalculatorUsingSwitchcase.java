package conditoinalOperatorswitchcaseAssignment;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner sc=new Scanner(System.in);
        do
        {
        System.out.println("Enter the first Number");
        int num1=sc.nextInt();
        System.out.println("Enter the second Number");
        int num2=sc.nextInt();
        System.out.println("Enter the Operator");
        char op=sc.next().charAt(0);
        
        switch(op)
        {
        case '+':System.out.println(num1+num2);break;
        case '-':System.out.println(num1-num2);break;
        case '*':System.out.println(num1*num2);break;
        case '/':System.out.println(num1/num2);break;
        default :System.out.println("Invalid Input");
        	
        }
         System.out.println("enter 1.toContinue and 0.toExit");
          n=sc.nextInt();
        }while(n!=0);
        
        
	}

}
