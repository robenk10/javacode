package patternAssignment;

public class FourthQuestion
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}

			for(int k=i-1;k>=1;k--)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}


		for(int n=5-1;n>=1;n--)

		{ 
			for(int g=1;g<=n;g++) 
			{ 
				System.out.print(" "+g); 
			} 
			for(int f=n-1;f>=1;f--)
			{ 
				System.out.print(" "+f); 
			} 
			System.out.println(); 
		}

	}

}
