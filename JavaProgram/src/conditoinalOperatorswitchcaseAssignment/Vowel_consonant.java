package conditoinalOperatorswitchcaseAssignment;
import java.util.*;
public class Vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the character:");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("this is vowel");
				break;
		default:
			System.out.println("this is consonant");
				break;
	}

}
}
