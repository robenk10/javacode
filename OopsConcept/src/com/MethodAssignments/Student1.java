package com.MethodAssignments;

public class Student1 {
	int id;
	String name;

	public void displayData() {
		id = 007;
		name = "robin";
		System.out.println(id + " id");

		System.out.println(name + " name");
		getId(); // call getId method
		System.out.println(id);
	}

	public int getId() {

		id = 9;
		return id;

	}

	public void stCustomData(int customId, String customName) // local variable that are assigning the in id and name
	{
		System.out.println(customId);
		System.out.println(customName);
	}

	void byValue(Student1 s2) {
		
        id=16;
   		Student1 s3 = s2;
		System.out.println(s3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s = new Student1();
		s.id = 112;
		// System.out.println(s.id);

		s.displayData(); // calling displayData method

		s.stCustomData(s.id=11, s.name="CustomName_AJay");
		System.out.println(s.id);
		System.out.println(s.name);

		Student1 s1 = new Student1();

		s1.byValue(s1);
		System.out.println(s1);
		System.out.println(s1.id);
	}

}
