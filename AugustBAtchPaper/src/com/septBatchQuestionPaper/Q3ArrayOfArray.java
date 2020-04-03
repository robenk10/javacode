package com.septBatchQuestionPaper;

public class Q3ArrayOfArray {

	public static void main(String[] args) {
		
		int arr[][] = {{1,0,0,1,1,1,0},{1,0,1,0},{0,0,0,0,1,1,1,0,0}};
		
		int count=0;
		int seat=0;
		for(int i=0;i<arr.length;i++)
		{     count=0;
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==0)
				{
					count++;
				}
				
			}
			System.out.println(++seat+" available are "+count);
		}

	}

}
