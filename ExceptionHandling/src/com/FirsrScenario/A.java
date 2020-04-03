package com.FirsrScenario;

import java.io.IOException;

import javax.imageio.IIOException;

public class A {
    
	public void get()  throws Exception 
	{
		 System.out.println("1st Scenario");
		 throw new IIOException("Checking the ");
	}
}
