package pattern;

public class AlphabetReverseTriangle {

	public static void main(String[] args) {
		int n=64;
		for(int i=4;i>=1;i--)
		{  
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)(n+k)+" ");
			}
			System.out.println();
		}
	}

}
