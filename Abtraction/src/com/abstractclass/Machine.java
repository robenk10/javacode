package com.abstractclass;

abstract class Machine {

	public void rotate()
	{
		System.out.println("IN abstract class machine  rotate method ");
	}

	abstract void crush();
}

abstract class Mixer extends Machine
{
	void crush() {

		System.out.println("IN Mixer class crush method ");
	}
	
	public void blend()
	{
		System.out.println("In Mixer class blend method");
	}

}

class Juicer extends Machine
{

	@Override
	void crush() {

		System.out.println("IN juicer class crush method ");
	}

	public void filter()
	{
		System.out.println("IN juicer class filter method ");
	}

}
