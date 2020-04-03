package whileLoopingAssignment;

public class UsingBreakStatementWhileLoop {

	public static void main(String[] args) {
		 // WAP to show the use of break statement 
		
			int i=1;
			int n=20;
			int sum=0;
			while(i<=n)
			{
				if(i==19)
				{
					break;
				}
				sum=sum+i;
				i++;
			}
			System.out.println(sum);

	}

}
