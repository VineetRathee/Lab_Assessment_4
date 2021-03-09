package com.bookAppStore.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Book {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String isbn;
	private String name;
	@OneToOne
	@JoinColumn(name="p_fk")
	private Publisher publisher;
	@OneToMany
	@JoinColumn(name =" c_fk")
	private List<Chapter> chapters;
	
	public Book() {}
	public Book(String isbn, String name, Publisher publisher) {
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
	}
    
	public Book(int bookId, String isbn, String name, Publisher publisher, List<Chapter> chapters) {
		super();
		this.bookId = bookId;
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
		this.chapters = chapters;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", publisher="
				+ publisher + ", chapters=" + chapters + "]";
	}
	
}












































