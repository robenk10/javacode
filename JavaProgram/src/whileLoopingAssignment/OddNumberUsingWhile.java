package whileLoopingAssignment;

public class OddNumberUsingWhile {

	public static void main(String[] args) {
		
		//WAP to print odd numbers from 521 to 229 using while loop. 
		 
		int i=521;
		int n=229;
		while(i>=n)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i--;
		}

	}

}
