package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Searialize implements Serializable {
	String name="Ronin";
	int id=100;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Searialize obj=new Searialize();
	 
      FileOutputStream fos=new FileOutputStream("F:\\JAVA NOTES sept batch\\java tuts\\Serialization/robin1.txt");
      ObjectOutputStream oos=new ObjectOutputStream(fos);
      oos.writeObject(obj);
      
      FileInputStream fos1=new FileInputStream("F:\\JAVA NOTES sept batch\\java tuts\\Serialization/robin1.txt");
      ObjectInputStream oos1=new ObjectInputStream(fos1);
      
      Searialize obj2=(Searialize) oos1.readObject();
      
      System.out.println(obj2.id+" "+obj2.name);
	}

}
