package com.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Academy {
       
	//Object For Course
  public static	ArrayList<Course> courseList=new ArrayList<Course>();
    
	//Object for student and key is course id
public static	HashMap<Integer,List<Student>> StudentMap=new HashMap<Integer, List<Student>>();
	
	//Object for Attendance and key is course id
public static HashMap<Integer,List<Attendance>> AttendanceMap=new HashMap<Integer, List<Attendance>>();
	
	//Object for Transaction and key is course id
   //10thousand first time student A paid 5000rs and again 5000rs
public static HashMap<Integer,List<Transaction>> TransactionMap=new HashMap<Integer, List<Transaction>>();
	
	//Object for TestResultMap and key is course id
public static	HashMap<Integer,List<TestResult>> TestResultMap=new HashMap<Integer, List<TestResult>>();

}
