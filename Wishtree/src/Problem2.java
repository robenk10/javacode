
public class Problem2 {
public static void main(String[] args) {
	String str="geeksforgeeks A-118, Sector-136, Uttar Pradesh-201305";
	//char[] s=str.toCharArray();
	char str1;
	for(int i=0;i<str.length();i++)
	{
         str1=str.charAt(i);
		if(str1>=48 && str1<=57)
		{
		 System.out.print(str1);
		}
	}

}
}
