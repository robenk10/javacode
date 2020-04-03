package com.ClassLlecture;


import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {

	public static void main(String[] args) {
		
		PriorityQueue<String> q=new PriorityQueue<String>();
		
		q.offer("ajay");
		q.offer("Ravi");
		q.offer("Ajay");
		q.offer("anaMika");
		
		//System.out.println(q);
		
		
		Queue<String> q1=new PriorityQueue<String>();
		q1.offer("food");
		q1.offer("jay");
		q1.offer("FOOF");
		q1.offer("Ravi");
		q1.offer("anaMika");
		
		
		//q1.poll();
		//System.out.println(q1.poll());
		System.out.println(q1);
		
		
		Queue<String> q2=new PriorityQueue<String>();
		q2.offer("aaklld");
		q2.offer("ajay");
		//q2.peek();
	    System.out.println(q2.peek());
	    
		
		

	}

}
