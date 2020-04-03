package com.ProfileStateAndCountry;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee(1,"swetha",new Profile("karnataka","India")));
		al.add(new Employee(2,"Abhinav",new Profile("Kathmandu","Nepal")));
		al.add(new Employee(3,"Robin",new Profile("maharashtra","India")));
        
		Collections.sort(al);
		System.out.println(al); 
	}

}
