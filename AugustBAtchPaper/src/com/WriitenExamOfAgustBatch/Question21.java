package com.WriitenExamOfAgustBatch;

import java.util.LinkedList;
import java.util.Queue;

public class Question21 {

	public static void main(String[] args) {
		
		
		Queue <String > queue=new LinkedList<String>();
		
		queue.add("virat");
		queue.add("Sachin");
		queue.add("Ajikya");
		queue.add("kapil");
		queue.add("dhoni");
		queue.add("shikar");
         
		for(String s:queue)
		{
			System.out.println(s);
			
		}
		System.out.println(queue.peek());
	

	}

}
