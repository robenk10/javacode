package patternAssignment;

public class QuestionNo10 {

	public static void main(String[] args) {
		
		int n=9;

		for(int i=n;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+ " ");
			}
			for(int m=n-1;m>=i;m--)
			{
				System.out.print(m+ " ");
			}
			System.out.println();
			
			
		}

	}

}
