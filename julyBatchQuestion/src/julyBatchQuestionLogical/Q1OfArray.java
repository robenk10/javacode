package julyBatchQuestionLogical;

import java.util.Arrays;

public class Q1OfArray {

	public static void main(String[] args) {
		
		int [] arr= {1,2,4,2,5,4,6,7,6,8,9,8,2,2,1};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<=arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int a:arr)
		{
			System.out.print(a);
		}
		

	}

}
