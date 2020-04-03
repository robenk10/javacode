package patternAssignment;

public class Question5b {

	public static void main(String[] args) {
		

		for(int n=5;n>=1;n--)

		{ 
			for(int g=1;g<=n;g++) 
			{ 
				if( g==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(g-1+" ");
				}
					
			} 
			for(int f=n-2;f>=1;f--)
			{ 
				System.out.print(f+" "); 
			} 
			
			System.out.print("* ");
			System.out.println(); 
		}

	}

	}


