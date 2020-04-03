package com.TestNo8QNo7;

public class Emp {
  int eid;
  String ename;
  int deptid;

  
  public Emp(int eid, String ename, int deptid) {
	this.eid = eid;
	this.ename = ename;
	this.deptid = deptid;
}


@Override
public String toString() {
	return "Emp [eid=" + eid + ", ename=" + ename + ", deptid=" + deptid + "]";
}
  
  
}
