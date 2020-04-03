package com.paintShop;

import java.util.*;

public class ColorDemo {

	public static void main(String[] args) {
		
		Set<Color> set=new HashSet<Color>();
		
		set.add(new Color("red" ,4));
		
		
		Color newColor = new Color("red" , 5);
		
		//System.out.println(set);
        for(Color c:set)
        {  
        	if ( c.cname.equals(newColor.cname))
        	{
        		c.qty = c.qty + newColor.qty ;
        	}
        	else
        	{
        		set.add(newColor);
        	}
        
        }
        
        System.out.println(set);
	}

}
