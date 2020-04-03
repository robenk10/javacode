package pattern;

public class TriangleOfAbCd {

	public static void main(String[] args) {
		
		int asci=64;
		
		for(int i=1;i<=4;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(asci+i)+" ");
			}
			System.out.println();
		}
	}

}
