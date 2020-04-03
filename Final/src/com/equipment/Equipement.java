package com.equipment;

abstract class Equipement 
{
	public void fill() 
	{
		System.out.println("In Equipement abstract class fill method ");
	}

	abstract void mix();
}

class Cement_Mixer extends Equipement 
{

	@Override
	void mix() 
	{
      System.out.println("In cement_Mixer class mix method");
	}
	
	
	public void pour()
	{
		System.out.println("In Cement_Mixer class pour method");
	}

}
