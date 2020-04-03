package com.AssignmentAdditional;

public class EmployeeClass {

   int id;
   String name;
   Dept d;

   
   public EmployeeClass(int id, String name, Dept d) {
	this.id = id;
	this.name = name;
	this.d = d;
}


   @Override
   public String toString() {
	return "EmployeeClass [id=" + id + ", name=" + name + ", d=" + d + "]";
}
   
   
   
    

}
