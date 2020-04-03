package com.TechnicalInterviewQ;

public class BestTimeToBuyStock {
    
	public static int sellStock(int [] prices)
	{
		int max=0;
		int min=Integer.MAX_VALUE;
		for(int i=0; i<prices.length; i++)
		{
			if(prices[i] < min)
			{
				min=prices[i];
			}
			else {
				max=countMax(max,prices[i]-min);
			}
		}
		return max;
	}
	
	public static int countMax(int max,int sMax) {
		return (max>=sMax?max:sMax);
	}
	public static void main(String[] args) {
		int [] arr={2,3,4,6,1,78,89};
		
		System.out.println(sellStock(arr));

	}

}
