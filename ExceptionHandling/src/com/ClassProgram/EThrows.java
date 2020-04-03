package com.ClassProgram;

import java.io.IOException;

class Demo7 {
	public void m() throws IOException, Exception {
		throw new IOException("error");
	}

	public void n() throws IOException, Exception {
		m();
	}

	public void p() throws Exception {

		try {
			n();

		} 
		catch (IOException e) {
			System.out.println(e);
		}

	}
}


	public class EThrows {

		public static void main(String[] args) throws Exception  {

			Demo7 d=new Demo7();
			d.p();

			System.out.println("height");
		}

	
	}