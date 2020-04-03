package testOne;

import java.util.Scanner;

public class Ques_8 {

	public static void main(String[] args) {
		int m1,m2,m3,m4,m5,total,per;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of five subjects:");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();

		total = m1 + m2 + m3 + m4 + m5;
		System.out.println(total);
		per = (total*100)/500;
		System.out.println(per);

		if(per>=70)
		{
			System.out.println("1st Class");
		}
		else if(per<70 && per>=60)
		{
			System.out.println("2nd Class");
		}
		else if(per<60 && per>=40)
		{
			System.out.println("3rd Class");
		}
		else
		{
			System.out.println("fail");
		}
	}

}

