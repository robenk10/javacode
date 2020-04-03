package com.files;

public class UrlPojo {
	private String company;
	private String title;
	private String date;
	private String location;
	private String summary;
	public UrlPojo() {
		
	}
	public UrlPojo(String company, String title, String date, String location, String summary) {
		super();
		this.company = company;
		this.title = title;
		this.date = date;
		this.location = location;
		this.summary = summary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	@Override
	public String toString() {
		return "UrlPojo [company=" + company + ", title=" + title + ", date=" + date + ", location=" + location
				+ ", summary=" + summary + "]";
	}

}
