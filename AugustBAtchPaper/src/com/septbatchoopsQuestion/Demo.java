package com.septbatchoopsQuestion;

public class Demo {

	public static void main(String[] args) {
		
		PercusionInstrument t=new Tabla();
		t.play();
		t.listenSound();
		t.listenSound();
		
		StringedInstrument v=new Voilen();
		v.play();
		v.listenSound();
		v.listenSound();

	}

}
