package pattern;

public class AlphabetAintoD {

	public static void main(String[] args) {
		int n=64;
		for(int i=1;i<=4;i++)
		{  
			for(int j=1;j<=4;j++)
			{
				System.out.print((char)(n+i)+" ");
			}
			System.out.println();
		}

	}

}
