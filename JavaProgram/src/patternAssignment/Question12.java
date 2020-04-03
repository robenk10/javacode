
package patternAssignment;

public class Question12 {

	public static void main(String[] args) {

		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();

		}

		for(int i=n;i>=1;i--)
		{
			for(int j=i-1;j<=n;j++)
			{ 
				System.out.print(j+" ");   
			}
			System.out.println(); 
		}


	}

}
