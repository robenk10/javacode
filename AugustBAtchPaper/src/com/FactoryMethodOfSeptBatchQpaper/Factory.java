package com.FactoryMethodOfSeptBatchQpaper;

public class Factory {

	
 public SnacksFactory Factory(String s)
	{
		if(s.equalsIgnoreCase("samosa"))
		{
			return new Samosa();
		}
		else
		{
			return new VadaPav();
		}
		
	}
}
