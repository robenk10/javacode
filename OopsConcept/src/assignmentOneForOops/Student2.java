package assignmentOneForOops;

public class Student2 {
	
	 int rollNo;
	 String name;
	 int marks;

	public static void main(String[] args) {
		
		
		//create Two Object of Student Using New Keyword
		
		Student2  s=new Student2();
		s.rollNo=1;
		s.marks=55;
		s.name="Ajay";
		
		Student2 s1=new Student2();
		s1=s;
		//System.out.println(s1==s);
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode());
		
		
		
		

	}

}
