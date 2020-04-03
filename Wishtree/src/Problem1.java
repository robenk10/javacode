import java.util.Scanner;

public class Problem1 
 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amt=sc.nextInt();
		int count=0;
		int count1=0;
		if(amt>=2000)
		{
			amt=amt-2000;
			count++;
		}else
		{
			amt=amt-500;
			count++;
		}
		System.out.println(amt+" " +count);
	}
}