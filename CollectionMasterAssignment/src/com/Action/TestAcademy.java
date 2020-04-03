package com.Action;

import java.sql.Date;
import java.util.ArrayList;

import com.Manager.FudAdd;
import com.bean.Academy;
import com.bean.Attendance;
import com.bean.Student;
import com.bean.TestResult;
import com.bean.Transaction;
import com.bean.Course;

public class TestAcademy {


	public static void main(String[] args) {
		
		//For Student Class
		Student s1=new Student(101,"Robin",191029,"robi@gmail.com");
		Student s2=new Student(102,"ram",718827,"ram@gmail.com");
		Student s3=new Student(103,"sham",292718,"sham@gmail.com");
	
		ArrayList<Student> studlist=new ArrayList<Student>();
		studlist.add(s1);
		studlist.add(s2);
		studlist.add(s3);
	
	
		
		

       //for Course Data
		Course c1 = new Course(1, "Computer", new Date(3 / 10 / 2017), "java", 30000, "2 months");
		Course c2 = new Course(2, "IT", new Date(4 / 10 / 2017), "Adv java", 40000, "3 months");
		Course c3 = new Course(3, "Computer", new Date(5 / 10 / 2017), "networking", 20000, "2 months");
		
		
		ArrayList<Course> courseList=new ArrayList();
		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
	 
		FudAdd.AddStudInfo(courseList, studlist);


		
		
		//for Attendance
	    	 Attendance a1=new Attendance(111, 101, "p", new Date(4/10/2017));
			Attendance a2=new Attendance(112, 102, "a", new Date(8/10/2017));
			Attendance a3=new Attendance(113, 101, "p", new Date(9/10/2017));
			Attendance a4=new Attendance(114, 102, "p", new Date(10/10/2017));
			Attendance a5=new Attendance(115, 103, "a", new Date(11/10/2017));
			
			//for TestResult
			TestResult ts1=new TestResult(new Date (1/2/2015),10,101,60,100);
			TestResult ts2=new TestResult(new Date (2/2/2015),11,102,50,100);
			TestResult ts3=new TestResult(new Date (3/2/2015),12,103,65,100);
			TestResult ts4=new TestResult(new Date (4/2/2015),13,104,54,100);
			TestResult ts5=new TestResult(new Date (5/2/2015),14,105,69,100);
			
			
			
			//For Transaction
			Transaction t1 = new Transaction(10000, 101, new Date(3 / 10 / 2017));
			Transaction t2 = new Transaction(5000, 102, new Date(4 / 10 / 2017));
			Transaction t3 = new Transaction(15000, 101, new Date(5 / 10 / 2017));
			Transaction t4 = new Transaction(20000, 103, new Date(21 / 10 / 2017));
			Transaction t5 = new Transaction(10000, 104, new Date(22 / 10 / 2017));
			
			
	}

}
