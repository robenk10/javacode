package com.abstractclass;

public class DemoMachine {

	public static void main(String[] args) {
		
		Machine j=new Juicer();
		j.crush();
		
		/* 
		 * Mixer m=new Mixer();   //cannot create object of abstract class
		 * m.blend(); m.crush(); m.rotate();
		 */

	}

}
