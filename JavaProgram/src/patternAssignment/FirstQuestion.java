package patternAssignment;

public class FirstQuestion {

	public static void main(String[] args) {
		
	        //  *****
			//	 ****
			//	  ***
			//     **
			//      *
		
		


		for(int i=4; i>=1 ; i--)
		{
			for(int j=4; j>=i; j--)
			 {
		
					 System.out.print("   ");
			 }
			for(int k=i; k>=1; k--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		 }
			

	}

}
