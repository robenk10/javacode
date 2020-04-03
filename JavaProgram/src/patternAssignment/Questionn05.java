package patternAssignment;

public class Questionn05 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				if (j == 1) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print(j - 1+" ");
				}
			}
			for (int k = i - 2; k >= 1; k--) 
			{
				
					System.out.print(k+" ");
					
				
					

			}
			System.out.print("* "+"\n");
			//System.out.println();
		}
	}

}
