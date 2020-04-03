package com.june2018;

public class Exampl6 {

	public static void main(String[] args) {
	
		int TempOfChem=100;
		int count=0;
		for(int i=1;i<10;i++)
		{
			
			if(TempOfChem<60)
			{
				System.out.println("hr required to "+count);
				break;
			}
			else
			{
				TempOfChem=TempOfChem-7;
				count++;
			}
		}

	}

}
