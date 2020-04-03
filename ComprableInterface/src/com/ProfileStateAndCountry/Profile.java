package com.ProfileStateAndCountry;

public class Profile {
    
	String statename;
	String Countryname;

	
	public Profile(String statename, String countryname) {
	
		this.statename = statename;
		Countryname = countryname;
	}

   
	
	@Override
	public String toString() {
		return "Profile [statename=" + statename + ", Countryname=" + Countryname + "]";
	}
	
	
	
	
}
