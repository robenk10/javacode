package com.bean;

public class Student {
    
	private int studentId;
	private String studentname;
	private int phoneNo;
	private String email;
	
	public Student(int studentId, String studentname, int phoneNo, String email) {
		this.setStudentId(studentId);
		this.setStudentname ( studentname);
		this.setPhoneNo ( phoneNo);
		this.setEmail(email);
	}

	

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", phoneNo=" + phoneNo + ", email="
				+ email + "]";
	}

	
}
