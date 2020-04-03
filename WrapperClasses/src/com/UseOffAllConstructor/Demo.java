package com.UseOffAllConstructor;

public class Demo {

	public static void main(String[] args) {
		String s="12";
		Integer i=new Integer("10");
		Integer i1=new Integer("10");
		System.out.println(s);
		int n=Integer.parseInt(s);
		System.out.println(i+n);
		System.out.println(i1);
		System.out.println(i+i1);
		System.out.println();
		
		
		Byte B = new Byte("55"); 
		System.out.println(B+19+" byte");
		Byte B3 = new Byte((byte) 'c'); 
		System.out.println(B3+" type cast");
		
		Character c=new Character('b');
		System.out.println(c);
		System.out.println();
		
		
		Float F1 = new Float(12.2f);
		System.out.println(F1+" Float Value");
		Float F2 = new Float("15.6");
		System.out.println(F1+" Float Vlaues OF "+F1+F2);
		Float F3 = new Float(15.6); 
		System.out.println(F3);
		System.out.println();
		
		
		
		Double D1 = new Double(17.8d); 
		System.out.println(D1+" double");
		Double D2 = new Double("17.8");
		System.out.println(D2);
		System.out.println();
		
		
		Boolean BLN1 = new Boolean(false); 
		System.out.println(BLN1);
		Boolean BLN2 = new Boolean("true"); 
		System.out.println(BLN2);
		System.out.println();
		
		Short S1 = new Short((short) 20);
		System.out.println(S1+" Short");
		Short S2 = new Short("10");   
		System.out.println(S2);
		System.out.println();
		
		
		Long L1 = new Long(40);   
		System.out.println(L1+"Long");
		Long L2 = new Long("30");   
		System.out.println(L2);
		
		
		
		
		
		
		

	}

}
