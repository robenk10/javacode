package pattern;

public class FirstPattern 
{

	public static void main(String[] args) 
	{  
		
		  //  * 
		  //  *  * 
		  //  *  *  * 
		   // *  *  *  *    
	  
	   //print star pattern as follow
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
