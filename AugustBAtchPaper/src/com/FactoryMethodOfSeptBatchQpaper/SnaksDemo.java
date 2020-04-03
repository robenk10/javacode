package com.FactoryMethodOfSeptBatchQpaper;

public class SnaksDemo {

	public static void main(String[] args) {
		
		
		Factory fact=new Factory();
		
		SnacksFactory obj=fact.Factory("VadaPav");
		obj.snacks();
	}

}
