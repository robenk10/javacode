package com.basic;

public class Sunlight {
	public static void main(String[] args) {
		// Distance from sun (150 million kilometers)
		long kmFromSun = 150000000;
		System.out.println(kmFromSun);
		long lightSpeed = 299792458; // meters per second
		// Convert distance to meters.
		System.out.println(lightSpeed);
		long mFromSun = kmFromSun * 1000;
		System.out.println(mFromSun);
		long seconds = mFromSun / lightSpeed;
		System.out.print("Light will use ");
		long min = seconds / 60;
		System.out.println(min);
		seconds = seconds - (min*60);
		System.out.println(seconds);
		System.out.print(min + " minute(s) and " + seconds + " second(s)");
		System.out.println(" to travel from the sun to the earth.");
		
		 int  a= (int) ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		 System.out.println(a);
		 
		 
	   double d=(double)4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
	   System.out.println(d);
		 

	}
}