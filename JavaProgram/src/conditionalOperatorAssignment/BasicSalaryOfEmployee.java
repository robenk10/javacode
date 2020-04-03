package conditionalOperatorAssignment;

import java.util.Scanner;

public class BasicSalaryOfEmployee 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic Salary");
		
        float basic_salary,gross_salary;
        basic_salary=sc.nextFloat();
        
        if(basic_salary<=10000)
        {
        	gross_salary=(float) (basic_salary*0.2+0.8);
        	System.out.println(gross_salary);
        }
        else if(basic_salary<=20000)
        {
        	gross_salary=(float) (basic_salary*0.25+0.9);
        	System.out.println(gross_salary);
        }
        else
        {
        	gross_salary=(float) (basic_salary*0.3+0.95);
        	System.out.println(gross_salary);
        }
	}

}
