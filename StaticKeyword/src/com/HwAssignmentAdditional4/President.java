package com.HwAssignmentAdditional4;

public class President {

  public static void main(String[] args) {
		int[] arr= {1,12,0,4,2,0};
		int temp;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count++;
			}

			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}

}
}
