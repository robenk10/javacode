package whileLoopingAssignment;

public class SumOfAllEvenNumberUsingWhileLoop {
   public static void main(String[] args) {
	   //Write a Java program to find sum of all even numbers between 1 to n. 
	    int i=1;
	      int n=20;
	      int sum=0;
	      while(i<=n)
	      {
	    	  if(i%2==0)
	    	  {
	    		  sum=sum+i;
	    	  }
	    	  i++;
	      }
	      System.out.println(sum);
		}
}

