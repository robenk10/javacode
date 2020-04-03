package com.june2018;

public class Example5 {
	
	int EachRose_Cost=3;
	int dozen_sell_price=100;
    int total_bought=600;
    int total_buying_cost=total_bought*EachRose_Cost;
    
    public int takeRoses()
    {
    	int sell_to_recover=0;
    	
    	for(int i=0;i<total_bought;i++)
    	{
    	    int sum=dozen_sell_price*i;	
    	    
    	    if(total_buying_cost==sum)
    	    {
    	    	sell_to_recover=i*12;
    	    }
    	}
    	
    	return sell_to_recover;
    }
	

	public static void main(String[] args) {
		
	Example5 rs=new Example5();
	
	int s=rs.takeRoses();
	System.out.println("Total rose to need sales "+s);

	}

}
