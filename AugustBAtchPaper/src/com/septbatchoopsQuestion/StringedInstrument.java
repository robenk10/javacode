package com.septbatchoopsQuestion;

public class StringedInstrument extends Sound implements MusicalInstrument {

	@Override
	public void play() {
		System.out.println("play some pop");
		
	}

	@Override
	void listenSound() {
		System.out.println("listen pop");
		
	}

}
