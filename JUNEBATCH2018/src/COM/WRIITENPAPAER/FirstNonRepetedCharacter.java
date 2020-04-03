package COM.WRIITENPAPAER;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FirstNonRepetedCharacter {

	public static void main(String[] args) {
		
		String s="thinkquotient is t  he best company to work for";
	
		
		char ch[] =s.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap();
		for(int i=0;i<ch.length;i++)
		{
			if(map.containsKey(ch[i])==false)
			{
				map.put(ch[i], 1);
			}
			else
			{
				int oldval=map.get(ch[i]);
				int newval=oldval+1;
				map.put(ch[i],newval);
			}
			
		}
		

		Set<Map.Entry<Character, Integer>>  s1=map.entrySet();
		
		for(Map.Entry <Character,Integer>s2:s1)
		{
		
			if(s2.getValue() == 1)
			{
			   
				System.out.println(s2.getKey());
				break;
	
				
			}
		}
	
	}

}
