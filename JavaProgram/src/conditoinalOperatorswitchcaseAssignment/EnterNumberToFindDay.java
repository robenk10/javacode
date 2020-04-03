package conditoinalOperatorswitchcaseAssignment;

import java.util.Scanner;

public class EnterNumberToFindDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	 System.out.println("Enter the number between 1 to 7");
	 Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
	 
     
     switch(num)
	 {
	    case 1:System.out.println("1->monday");break;
		case 2:System.out.println("2->tuesday");break;
		case 3:System.out.println("3->wednesday");break;
		case 4:System.out.println("4->thursday");break;
		case 5:System.out.println("5->friday");break;
		case 6:System.out.println("6->saturday");break;
		case 7:System.out.println("7->sunday");break;
		
		default:System.out.println("Invalid Input");break;
	 }
	 
	}

}
