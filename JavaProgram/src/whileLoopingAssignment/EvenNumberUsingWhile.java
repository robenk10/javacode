package whileLoopingAssignment;

public class EvenNumberUsingWhile {

	public static void main(String[] args) 
	{
		// WAP to print even numbers from 121 to 229 using for loop. 
		
		int i=121;
		int n=229;
		while(i<=n)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}

	}

}
