package whileLoopingAssignment;

public class NumberOfBarals {

	public static void main(String[] args) {
		/*
		 * 24. You have 20 barrels of fuel. The price per barrel is 89rs. For the first
		 * 10 barrels. If someone wants more than 10 barrels, the price reduces by the
		 * number of barrels bought. For e.g. the price of 6 barrels is 6 * 89 But price
		 * of 12 barrels is 12 * (89 - 12) or price of 18 barrels is 18 * (89 - 18) and
		 * so on. Display all the prices from 1 to 20 barrels.
		 */
		int from=1;
		int to=20;
		int price_of_barrel=89;
		int price_of_firstten=0;
		int price_of_afterTen=0;
		while(from<=to)
		{
			if(from<=10)
			{
				price_of_firstten = from*89;
				System.out.println(price_of_firstten);
			}
			else if(from>=11 && from<=20)
			{
				price_of_afterTen=from*(89-from);
				System.out.println(price_of_afterTen);
			}
			from++;
		}
	}

}
