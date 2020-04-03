package com.septbatchoopsQuestion;

public class Tabla extends PercusionInstrument{
  

	@Override
	public void play() {
	    super.play();
		System.out.println("play classical....");
		
	}

	@Override
	void listenSound() {
		super.listenSound();
		System.out.println("listen classical....");
	}
}
