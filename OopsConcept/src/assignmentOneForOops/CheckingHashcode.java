package assignmentOneForOops;

public class CheckingHashcode {

	public static void main(String[] args) {
		
		
		//8. print 2 objects in sysout and see its hashcode is different 
		
		CheckingHashcode ch=new  CheckingHashcode();
		CheckingHashcode ch1=new  CheckingHashcode();
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println("it has Different hashcode");
		
		
		System.out.println("==================");
		ch=ch1;
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println("Hashcode is same of ch=ch1");
		
		
	}

}
