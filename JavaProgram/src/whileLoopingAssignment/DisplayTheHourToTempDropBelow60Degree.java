package whileLoopingAssignment;

public class DisplayTheHourToTempDropBelow60Degree {

	public static void main(String[] args) {
		
		/*
		 * The temperature of a chemical is 100 degree celsius. Every hour the
		 * temperature drops by 7 degrees. Display the hours till the temperature drops
		 * below 60 degrees
		 */
		int Chem_Temprature=100;
		int cnt=0;
		do
		{
			 Chem_Temprature= Chem_Temprature-7;
			 cnt++;
		}while(Chem_Temprature>=60);
		System.out.println("The Temprature Drops Below 60 Degree in "+cnt+" hr");
		
	}

}
