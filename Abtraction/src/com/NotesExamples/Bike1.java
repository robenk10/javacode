package com.NotesExamples;

abstract class Bike1 {
	Bike1() {
		System.out.println("bike1 is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda1 extends Bike1 {
	void run() {
		System.out.println("running safely..");
	}
	
}

class TestAbstraction2 {
	public static void main(String args[]) {
	Honda1 obj = new Honda1();
		obj.run();
		obj.changeGear();
	}
}