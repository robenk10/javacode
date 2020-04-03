package pattern;

public class SecondQ {

	public static void main(String[] args) {
		
		//Print diamond 
		
	//	    * 
	//	   * * 
	//	  * * * 
	//	 * * * * 
	//	  * * * 
	//	   * * 
	//	    * 
		
		int n;
		for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
