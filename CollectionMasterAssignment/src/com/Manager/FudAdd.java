package com.Manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.bean.Academy;
import com.bean.Course;
import com.bean.Student;

public class FudAdd {

	//For Student AddFunction...
	public static int courseid;
	public static void AddStudInfo(ArrayList<Course> courselist,ArrayList<Student> Studlist)
	{  
		Iterator  itr=courselist.iterator();
		while(itr.hasNext())
		{
			Course c=(Course) itr.next();
			courseid=c.courseId;

			if(Studlist==null)
			{
				Academy.StudentMap.put(courseid, Studlist);
			}
			Iterator itr1=Studlist.iterator();
			while(itr1.hasNext())
			{   
				ArrayList<Student> s=(ArrayList<Student>) itr1.next();

				for(int i=0;i<s.size();i++)
				{
					if(courseid==1|| i==0)
					{
						Academy.StudentMap.put(courseid, s);
					}

					else  if(courseid==2|| i==1)
					{
						Academy.StudentMap.put(courseid, s);
					}
					else  if(courseid==3|| i==2)
					{
						Academy.StudentMap.put(courseid, s);
					}
				}

			}
			
	}
		
	
	}
}


