package whileLoopingAssignment;

public class NumberIsPrimeOrNot {

	public static void main(String[] args) {

		//Find all prime number between 400 to 300;

		 int n1=400;
		 int n2=300;
		 while(n1>n2)
		 {
			int num1=n1;
			int i=2;
			while(i<num1)
			{
				System.out.println(num1);
				i++;
			}
			 n1--;
		 }


	}

}
