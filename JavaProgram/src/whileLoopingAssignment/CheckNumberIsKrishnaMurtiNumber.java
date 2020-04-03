package whileLoopingAssignment;

import java.util.Scanner;

public class CheckNumberIsKrishnaMurtiNumber 
{

	public static void main(String[] args)
	{
		/*
		 * check no is krishnamurthi or not 153=1!+5!+3!=153
		 */
		System.out.println("Enter The Number To Check Number Is Krishnamurti Number Or Not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int origNo=num,d,i,fact=1,sum=0;

		while(num>0)
		{   
			fact=1;
			d=num%10;
			i=d;
			while(i>0)
			{
				fact=fact*i;
				i--;
				
			}
			num=num/10;
			sum=sum+fact;
		}
		System.out.println(sum);  
		
		if(origNo==sum)
		{
			System.out.println("The Number is KrishnaMurti Number");
		}
		else
			System.out.println("The Number is Not Krishnamurti");
		 
		

	}

}
