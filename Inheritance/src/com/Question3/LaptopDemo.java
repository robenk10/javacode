package com.Question3;

public class LaptopDemo {

	public static void main(String[] args) {
		
		Laptop lp=new Laptop();
		
		lp.setNoOfUSBport(4);
		lp.setProcessorSpeed((int)1.33);
        
		System.out.println(lp.getNoOfUSBport());
		System.out.println(lp.getProcessorSpeed());
		
		int noOfport=lp.getNoOfUSBport();
		int processorSpeed=lp.getProcessorSpeed();
		System.out.println(noOfport);
		System.out.println(processorSpeed);
	}

}
