package whileLoopingAssignment;

public class CalculateTheTotalOfItem1 {
	public static void main(String[] args) {
		/*
		 * You have hundred items (1,2,3,…100) the price of each item is the same as its
		 * number. i.e., item 1 is of 1 rs. Item 2 is of 2 rs. And so on. Calculate the
		 * total of the items.
		 */
		
		 int first_item=1;
		 int last_item=100;
		 int item_price;
		 int total = 0;
		 while(first_item<=last_item)
		 {
			 item_price=first_item;
			 total=total+first_item;
			 
			 first_item++;
		 }
		 System.out.println(total);
		 
	}

}
