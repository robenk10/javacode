package assignmentOneForOops;

public class Student10 {
	
	int id=10;
	String name="Robink";
	

	public static void main(String[] args) {
		
		
		// 10. add id,name in student class. assign value to id name there 
		// itself and in main method print values. Then change value 
		//      of instance variables and again print the values. Observe 
	   //	you cannot access id directly without creating object. Also 
	  //	2 objects have 2 seperate set of data
          
	  /*	System.out.println(id);       cannot access instance variable directly without object
	   *    System.out.println(name);*/   
		
		Student10 s=new Student10();
		Student10 s1=new Student10();
		
		s.id=1;
		s1.id=1;
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
	}

}
