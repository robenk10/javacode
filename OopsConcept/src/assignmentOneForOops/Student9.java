package assignmentOneForOops;

public class Student9 {
 int rollno;
 int marks;
	public static void main(String[] args) {
		
		// If you do this Student s1 = new Student(); Student s2 = s1; 
		//Now print sop(s1) sop(s2) see both reference variables are 
		//pointing to same location. 
		//But if you use new keyword for s1 and s2 see both values 
		//would be different 
		
		
		Student9 s=new Student9();
		 
		Student9 s2=new Student9();
		
		s2=s;
		System.out.println(s.marks=57);
		System.out.println(s2.marks=56);
		System.out.println(s.marks);
		
		System.out.println(s==s2);
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());

	}

}
