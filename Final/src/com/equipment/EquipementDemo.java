package com.equipment;

public class EquipementDemo {

	public static void main(String[] args) {
		
		Cement_Mixer cm=new Cement_Mixer();
		cm.fill();
		cm.mix();
		cm.pour();
		
		
		Equipement  e=new Cement_Mixer();
		e.mix();
		e.fill();
		
		
	}

}
