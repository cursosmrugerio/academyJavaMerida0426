package com.curso.v0;

import java.util.function.*;

public class Book2 {
    private int id; 
    private String title;
    
	public Book2(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public static void main(String[] args) {
		Book book = new Book(1,"PHP");
		//DEFINICION LAMBDA
		Consumer<Book> c = b -> { 
			String details = b.getId()+":"+b.getTitle();
			System.out.println(details);
		}; 
		//EJECTA LAMBDA
		c.accept(book); 
		//System.out.println(c);
	}

}
