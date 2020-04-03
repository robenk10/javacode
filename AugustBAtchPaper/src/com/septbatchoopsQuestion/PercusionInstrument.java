package com.septbatchoopsQuestion;

public class PercusionInstrument  extends Sound implements MusicalInstrument{

	@Override
	public void play() {
		System.out.println("play some classical");
		
	}

	@Override
	void listenSound() {
		
		System.out.println("listen classical");
		
	}

}
