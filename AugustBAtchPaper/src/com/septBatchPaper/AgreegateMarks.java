package com.septBatchPaper;

public class AgreegateMarks implements Comparable{
 
    Float a;

	@Override
	public int compareTo(Object o) {
		 
		AgreegateMarks am=(AgreegateMarks)o;
		return (int) (am.a-this.a);
	}

	@Override
	public String toString() {
		return "AgreegateMarks [a=" + a + "]";
	}
    
    
}
