package com.ExamQuestion;

public class Demo {

	public static void main(String[] args) {
	
	BusTicket bs=new BusTicket();
	
	Passanger p=new Passanger(bs);
	Passanger p1=new Passanger(bs);
	Passanger p2=new Passanger(bs);
	Passanger p3=new Passanger(bs);
	
	p.start();
	p1.start();
	p2.start();
	p3.start();
	

	}

}
