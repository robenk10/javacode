package COM.WRIITENPAPAER;

public class FirstNotRepetedAnotherWay {
    
	public static void main(String[] args) {
		
		
		String s1="Thinkquotient is the best company to work for";
		
		String s=s1.toLowerCase();
		
		char ch[] =s.toCharArray();
		int c=1;
		for(int i=0;i<ch.length;i++)
		{  
			c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
				}
			}
			
			if(c==1)
			{
				System.out.println(s1);
				System.out.println(ch[i]);
		       System.exit(0);
			}
		}
	}
}
