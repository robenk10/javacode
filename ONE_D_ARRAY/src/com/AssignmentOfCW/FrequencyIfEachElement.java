package com.AssignmentOfCW;

public class FrequencyIfEachElement {

	public static void main(String[] args) {

		int arr[]= {4,3,5,3,4,6,6,2,4};

		boolean flag=false;
		int count = 0;
		int i;

		for( i=0;i<arr.length;i++)
		{   flag=false;
			count=1;

			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
				}

			}



			if(flag==false)
			{
				for(int k=i+1;k<arr.length;k++)
				{
					if(arr[i]==arr[k])
					{
                       count++;
					}
				
				}
				System.out.println(arr[i]+" "+count);
				
			}
		
		}
	}

}
