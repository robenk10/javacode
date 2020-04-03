package com.AssignmentOfCW;

public class UniqueElement {

	public static void main(String[] args) {
		
		int arr[]= {4,3,5,3,6,4,4,3,4,3};

		boolean flag=false;
		int count = 0;
		int i;
		int k;

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
				for(k=i+1;k<arr.length;k++)
				{
					if(arr[i]==arr[k])
					{
                       count++;
                      
					}
					
			     }
				 
				if(count<=1)
				{
				System.out.println(arr[i]+" "+count);
				}
				
				
			}
		
		}

	}

}
