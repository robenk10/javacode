package com.BoxingAndUnBoxing;

public class Assig2 {

	public static void main(String[] args) {
     	//UNBOXING........
		
		Byte b=new Byte((byte) 12);
		byte b1=b.byteValue();
	    System.out.println(b1+" byte");
	    
	    
		Integer i=new Integer(10);
		int a=i.intValue();
		System.out.println(a+" int");
		
	
        Short sh1=new Short((short) 100);
        short sh2=sh1.shortValue();
        System.out.println(sh2+" short");
        
        
        Long l=new Long(500);
        long l1=l.longValue();
        System.out.println(l1+" long ");
        
        Float f=new Float(1.23f);
        float f1=f.floatValue();
        System.out.println(f1+" float");
        
        Double d=new Double(1232);
        double d1=d.doubleValue();
        System.out.println(d1+" double");
        
        Character c=new Character('j');
        char c1=c.charValue();
        System.out.println(c1+" char");
        
        Boolean bl=new Boolean(true);
        boolean bl1=bl.booleanValue();
        System.out.println(bl1+" boolean");
		

	}

}
