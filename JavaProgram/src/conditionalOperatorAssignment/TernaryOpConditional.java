package conditionalOperatorAssignment;

import java.util.Scanner;

public class TernaryOpConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the three Number");
       
       int num1=sc.nextInt();
       int num2=sc.nextInt();
      
      int num3=sc.nextInt();
       
       System.out.println("Enter the Operator");
       char op=sc.next().charAt(0);
       
       int res=(num1>num2)?num1:num2;
       System.out.println("Greater Number is "+res);
       System.out.println("***********************************");
       
       String str=(num1>0&&num2>0)?"Number is Positive ":"Number is Negative";
       System.out.println("The number is "+str);
       System.out.println("**********************************");
       
       int Calculate=(op=='+')?num1+num2:(op=='-')?num1-num2:(op=='*')?num1*num2:num1/num2;
       System.out.println("Calculate Number is "+Calculate);
       System.out.println("************************************");
       
       String str1=(num1>num2)?(num1>num3)?"num1 is Greater":"c is Greater":(num2>num3)?"num2 is greter":"num3 is greter";
       System.out.println(" Greater Number is "+str1);
	}

}
