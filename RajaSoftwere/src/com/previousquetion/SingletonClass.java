package com.previousquetion;

class Singleton{
	private static  Singleton singleton= null;
	private String name;
	
	private Singleton() {
		this.name="Hello";
	}
	public static Singleton getInstance() {
		if(singleton==null) {
			return singleton=new Singleton();
		}
		else {
			return singleton;
			
		}
	}
	
}

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Singleton singleton=Singleton.getInstance();
      System.out.println(singleton);
     
    
      
	}

}
