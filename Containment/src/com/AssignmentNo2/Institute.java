package com.AssignmentNo2;

import java.util.Scanner;

public class Institute {
	int id;
	String name;
	Branch b;

	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void setB(Branch b) {
		this.b = b;
	}
	public Branch getB() {
		return b;
	}
	
	

	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("for Institute Data::");
		System.out.println("Enter the Institute id and name");
		int id=sc.nextInt();
		String name=sc.next();
		Institute i=new Institute();
		i.setId(id);
		i.setName(name);
		i.setB(new Branch());
		
		System.out.println("Enter the Branch Details");
		System.out.println("Enter the branch id and name");
		int id1=sc.nextInt();
		String name1=sc.next();
		i.getB().setId(id1);
		i.getB().setName(name1);
		i.getB().setS(new Subject());
		
		System.out.println("Enter the Subject Details");
		System.out.println("Enter the Subject id and name");
		int id2=sc.nextInt();
		String name2=sc.next();
		i.getB().getS().setId(id2);
		i.getB().getS().setName(name2);
		i.getB().getS().setT(new Topic());
		
		System.out.println("Enter the Topic Details");
		System.out.println("Enter the Topic id and name");
		int id3=sc.nextInt();
		String name3=sc.next();
		i.getB().getS().getT().setId(id3);
		i.getB().getS().getT().setName(name3);
		i.getB().getS().getT().setSb(new Subtopic());
		
		
		System.out.println("Enter the suBTopic Details");
		System.out.println("Enter the SubTopic id and name");
		int id4=sc.nextInt();
		String name4=sc.next();
		i.getB().getS().getT().getSb().setId(id4);
		i.getB().getS().getT().getSb().setName(name4);
		i.getB().getS().getT().getSb().setQ(new Question());
		
		System.out.println("Enter the suBTopic Details");
		System.out.println("Enter the SubTopic id and name");
		int id5=sc.nextInt();
		String name5=sc.next();
		i.getB().getS().getT().getSb().getQ().setId(id5);
		i.getB().getS().getT().getSb().getQ().setName(name5);
		
		
		System.out.println(i.toString());
		
		
		
		

	}

}
