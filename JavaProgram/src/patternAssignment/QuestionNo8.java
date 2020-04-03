package patternAssignment;

public class QuestionNo8 {

	public static void main(String[] args) {


		int n=1;

		for(int i=n;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print("  ");
			}

			for(int j=1;j<=i;j++) 
			{ 
				System.out.print(j+" "); 
			}

			
			  for(int m=i-1;m>=1;m--) 
			  { 
				  System.out.print(m+ " "); }
			 
			System.out.println();


		}

	}

}
