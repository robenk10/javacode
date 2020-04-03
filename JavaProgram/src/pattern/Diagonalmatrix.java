package pattern;

public class Diagonalmatrix {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=4;i++)
		{  
			for(int k=1;k<=4;k++)
			{
			   if(i==k || i+k==n+1)
			   {
				   System.out.print("* ");
			   }
			   else
			   {
				   System.out.print(" ");
			   }
			   
			
			}

			System.out.println();
		}
	}

}
