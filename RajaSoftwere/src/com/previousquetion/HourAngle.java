package com.previousquetion;

public class HourAngle {
		
	public static void isAngle(double h,double m) {
		
		if(h==12) {
			h=0;
		}
		if(m==60) {
			m=0;
		}
		int hrHand=(int ) (0.5*(h*60+m));
		int minHand=(int) (6*m);
		int angle=(hrHand-minHand);
		angle=(angle<0)?-angle:angle;
		angle=(angle>180)?360-angle:angle;
		System.out.println(angle);
	}

	public static void main(String[] args) {
		
     isAngle(7,5);
   
	}

}
