package com.curso.v0;

import java.util.function.*;

public class Book1 {
    private int id; 
    private String title;
    
	public Book1(int id, String title) {
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
		Consumer<Book> c = 
				b->System.out.println(b.getId()+":"+b.getTitle()); 
		c.accept(book); 
	}

}
