package com.diagonalMatrixSum;

public class Demo {

	public static void main(String[] args) {

		int[][] arr= {{11,2,4},{4,5,6},{10,8,-12}};
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				{
					System.out.print(arr[i][j]);
					sum=sum+arr[i][j];
                }
			   if(j==arr.length-1-i)
		     	{
					sum1=sum1+arr[i][j];
		     	}
			}
		}

		System.out.println(sum+" "+sum1);
		
		
	}
}
