package assignmentOneForOops;

public class Question15 {
	
	int rollno;
	int sub1,sub2,sub3;

	public static void main(String[] args) {
		  
		
		//create student class assign marks and calculate the percentage and print the result 1st class,2nd class etc. 
        
		Question15 q=new Question15();
		q.rollno=16;
		q.sub1=60;
		q.sub2=58;
		q.sub3=70;
		float total,avg,per;
		
		total=q.sub1+q.sub2+q.sub3;
		avg=(float)total/3;
		per=(float)(total/300)*100;
		System.out.println(per);
		
		String s=(per>=70)?"distinction":(per>=60 && per<70)?"1st class":(per>=50 && per<60)?"2nd class":"fails";
		System.out.println(s);
				
	}

}
