package assignmentOneForOops;

import java.util.Scanner;

public class Student11 {
   int id;
   String name;
	public static void main(String[] args) {
		
		//11. From scanner In loop (for 2 iterations) read Student 
		//data create new object each time assign values and print 
		//student values in console
       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbe to iterate the loop");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			Student11 s=new Student11();
			System.out.println("enter student id");
			s.id=sc.nextInt();
			System.out.println("Enter the student name");
			s.name=sc.next();
			System.out.print(s.id+" ");
			System.out.print(s.name);
			System.out.println();
		}
	}

}
