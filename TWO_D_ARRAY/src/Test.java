
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int a[][] ={ {1,2,3},{5,6,7},{8,9,6}};
		
		
		for(int i=0;i<a.length;i++)
		{  
			for(int j=a[i].length-1;j>=0;j--)
			{   
				if(i==j||j==a.length-1-i) {
					System.out.print(a[i][j]);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
		
	}

}
