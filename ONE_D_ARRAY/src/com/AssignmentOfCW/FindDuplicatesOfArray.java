package com.AssignmentOfCW;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesOfArray {

	public static void main(String[] args) { 
		int arr[]= {4,3,5,3,6,4,4,3,4,3};

		/*boolean flag=false;
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
				 
				if(count>1)
				{
				System.out.println(arr[i]+" "+count);
				}*/
				
				
			HashMap<Integer,Integer> map=new HashMap();
			int count=1;
			for(int i:arr) {
				
					map.put(i, map.containsKey(i)?map.get(i)+1:1);
				
			}
			//System.out.println(map);
			for(Map.Entry<Integer,Integer> m:map.entrySet()) {
				if(m.getValue()>1) {
					System.out.println(m.getKey()+" "+m.getValue());
				}
			}
		
		
	}
}
