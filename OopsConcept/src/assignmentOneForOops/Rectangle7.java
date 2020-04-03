package assignmentOneForOops;

public class Rectangle7 {
    
	int l,b,h;
	
       
	  
	
	public static void main(String[] args) {
		
		//Write a program to create multiple objects of one type only. 
      Rectangle7 r=new  Rectangle7(),r1=new  Rectangle7(),r2=new  Rectangle7();
      
      r.b=4;
      r.h=5;
      r.l=8;
      
      System.out.println(r.b*r.h*r.l);
      r1=r;
      //r1.b=3;
      System.out.println(r1);
      System.out.println(r);
      System.out.println(r1.equals(r2)+    "   Checking content");
      System.out.println((r1==r)+     "  Checking address");
	}

}
