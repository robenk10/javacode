package com.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;


public class FinalDemo {
	  public static void main(String[] args) {
		    try {
			/*
			 * File file = new File("D:\\DemoData\\urldata.csv"); FileWriter outputfile =
			 * new FileWriter(file); CSVWriter writer = new CSVWriter(outputfile, ',',
			 * CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER,
			 * CSVWriter.DEFAULT_LINE_END);
			 */
		      // fetch the document over HTTP
		      Document doc = Jsoup.connect("https://www.indeed.co.in/jobs?q=java&l=pune").get();
		     
		      // get the page title
		    String title = doc.title();
		    System.out.println("title: " + title);
		      
		    // get all links in page
		   //  Elements links = doc.select("a[href]");
		     
		    Elements links1 = doc.getElementsByClass("company");
		    for(Element l:links1)
		    {
		    	UrlPojo u1=new UrlPojo();
			    u1.setCompany(links1.text().toString());
			    System.out.println(u1);
		    }
		     
		      
		     Elements links2 = doc.getElementsByClass("title");
		     for(Element l2:links2)
			    {
			    	UrlPojo u2=new UrlPojo();
				    u2.setCompany(links2.text().toString());
				    System.out.println(u2);
			    }
		      
		     Elements  links3 = doc.getElementsByClass("date");		
		     for(Element l3:links3)
			    {
			    	UrlPojo u3=new UrlPojo();
				    u3.setCompany(links3.text().toString());
				    System.out.println(u3);
			    }
		      
		   Elements  links4 = doc.getElementsByClass("summary");
		   for(Element l4:links4)
		    {
		    	UrlPojo u4=new UrlPojo();
			    u4.setCompany(links4.text().toString());
			    System.out.println(u4);
		    }
		      
		  Elements links5 = doc.getElementsByClass("location");
		  for(Element l5:links5)
		    {
		    	UrlPojo u5=new UrlPojo();
			    u5.setCompany(links5.text().toString());
			    System.out.println(u5);
		    }
		  
		 
		  
	      ArrayList<UrlPojo>al=new ArrayList<UrlPojo>();
		   al.add(new UrlPojo());
	    	 System.out.println("---------------");
		     
		   //writer.writeNext(al);  
	       // writer.close();  
		    }
		    catch (IOException e)
		    {
		    e.printStackTrace();
		    }
	  	}
	}

