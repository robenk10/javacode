package com.septbatchoopsQuestion;

public class Voilen extends StringedInstrument {
  
	@Override
	public void play() {
		super.play();
		System.out.println("play some pop....");
		
	}

	@Override
	void listenSound() {
		super.listenSound();
		System.out.println("listen pop..");
	}
}
