package com.curso.v0;

import java.util.function.*;

public class Book3 {
    private int id; 
    private String title;
    
	public Book3(int id, String title) {
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
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}

	public static void main(String[] args) {
		Book3 book = new Book3(1,"PHP");
		
		Consumer<Book3> c = System.out::println;
		//                 t -> System.out.println(t);
		
		c.accept(book);

	}

}
