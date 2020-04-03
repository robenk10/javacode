package assignmentOneForOops;

public class Quetion11 {
    int id;
    String name;
    float mark;
	public static void main(String[] args) {
		
		
		//12) Write a program to copy values of one object into another by assigning the values of 
		//one object into another
		
		
		Quetion11 q=new Quetion11();
		
		q.id=11;
		q.name="samrat";
		q.mark=88;
		
		
		Quetion11 q1=new Quetion11();
		
		q1=q;
		System.out.println(q1.id);
		System.out.println(q1.mark);
		System.out.println(q1.name);
		
		

	}

}
