package com.BookAuthorArrayLIstUsingGetterSetter;

public class Book {
	
	int id;
	String name;
	int AuthorId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAuthorId() {
		return AuthorId;
	}
	public void setAuthorId(int authorId) {
		AuthorId = authorId;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", AuthorId=" + AuthorId + "]";
	}
	
	
	
	

}
