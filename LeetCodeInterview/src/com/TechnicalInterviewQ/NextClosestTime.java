package com.TechnicalInterviewQ;

import java.util.Arrays;
import java.util.HashSet;

public class NextClosestTime {
	
	public static String nextClosest(String tm) throws Exception {
		
		int min =Integer.parseInt(tm.substring(0,2))*60;
		min += Integer.parseInt(tm.substring(3));
		System.out.println(min);
		
		HashSet<Integer> set=new HashSet();
		
		for(char c:tm.toCharArray()) {
			set.add(c-'0');
		}
		System.out.println(set);
		boolean isvalid=true;
		while(true) {
			min =(min+1)%(24*60);
			int [] nextTime= {min/60/10,min/60%10,min%60/10,min%60%10};
			System.out.println(Arrays.toString(nextTime));
			for(int c:nextTime) {
				
				if(! set.contains(c)) {
					isvalid=false;
				}
			}
			
			if(isvalid) {
				return String.format("%02d:%02d	", min/60,min%60);
			}
			else {
				
				throw new Exception("Not found closest time");
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		
		String time="12:30";
		try {
			System.out.println(nextClosest(time));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(751/60);

	}

}
