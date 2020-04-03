package com.CLassLecture;

import java.util.Stack;

public class Demo1 {

	public static void main(String[] args) {
	
		
		Stack <String > s=new Stack<String>();
		
		s.push("ajay");
		s.push("anamika");
		s.push("Aja");
		s.push("Ravi");
		s.push("Ravi");
		
		System.out.println(s);
		
		String s1=s.peek();
		System.out.println(s1);
		
		String s11=s.peek();
		System.out.println(s11);
		
		String s111=s.peek();
		System.out.println(s111);
		
		System.out.println(s.size());
        
		s.set(0, "Robin");
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		
		
		System.out.println(s.pop());
		int x=s.search("Ravi");
		System.out.println(x);
		
		System.out.println(s.empty());
		
		
	}

}
