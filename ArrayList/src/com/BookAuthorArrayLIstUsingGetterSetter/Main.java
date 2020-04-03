package com.BookAuthorArrayLIstUsingGetterSetter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ArrayList::");
		ArrayList<Book> al = new ArrayList<Book>();
		ArrayList<Autor> al2 = new ArrayList<Autor>();

		Autor a = null;
		Book b = null;
		for (int i = 0; i <2; i++) {
			b = new Book();
			System.out.println("Enter the id");
			b.setId(sc.nextInt());
			System.out.println("Enter the Name");
			b.setName(sc.next());
			System.out.println("Enter the AuthorId");
			b.setAuthorId(sc.nextInt());
			al.add(b);
		}
		//System.out.println(al);


		for (int j = 0; j <2; j++) 
		{

			a = new Autor();
			System.out.println("Enter the Autor Id");
			a.setAuthorid(sc.nextInt()); 
			System.out.println("Enter the AutorName");
			a.setAuthorname(sc.next()); 
			al2.add(a);

		} 
		System.out.println(al);
		System.out.println(al2);


		String s="rr";
		int aid;


		Iterator<Autor> itr= al2.iterator(); 
		while(itr.hasNext())
		{ 
			Autor ad=itr.next(); 
			if(ad.Authorname.equalsIgnoreCase(s)) 
			{ 
				aid=ad.Authorid;

				Iterator<Book> itr2=al.iterator(); 
				while(itr2.hasNext())
				{
					Book bd=itr2.next(); 
					if(bd.AuthorId==aid) 
					{ 
						for(int i=0;i<al.size();i++) 
						{
							System.out.println(al.get(i).getId()+" "+al.get(i).getAuthorId()+" "+al.get(i).getName()); }

						
						
						
					} }


			}

		}





		//Iterator itr= al



	}

}
