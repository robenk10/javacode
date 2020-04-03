import java.util.Arrays;

public class Problem3 {
public static void main(String[] args) {
	
	
     String s="aaaw-2222 dfrsad-2221";
	 String s1[] =s.split(" ");
	 for(int i=0; i<s1.length; i++) {
		 
		 if(s1[i].contains("-")) {
			 
			 String str[] =s1[i].split("-");
			 System.out.print(str[1]+" ");
		 }
	 }
}
}
