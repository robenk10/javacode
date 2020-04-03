package whileLoopingAssignment;

public class AlphabetPrintUsingWhile {

	public static void main(String[] args) {
		//Write a Java program to print all alphabets from a to z. - using  for loop

		int num1=65;
		int num2=122;
		int n1=num1;
		int n2=num2;
		while(num1<=num2)
		{
			if(num1==91)
			{
				num1=97;
			}
			System.out.print(" "+(char)num1);
			num1++;
		}

	}

}
