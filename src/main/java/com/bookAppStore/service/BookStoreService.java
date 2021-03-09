package com.bookAppStore.service;



import com.bookAppStore.dao.Book;
import com.bookAppStore.dao.BookDao;
import com.bookAppStore.dao.BookDaoImpl;

public class BookStoreService {
     
	
	private BookDao bookdao = new BookDaoImpl();
	
	
	public void persistObjectGraph(Book book)  {
		
		bookdao.addBook(book);
	  
		
		
	}
	
	public Book retrieveObjectGraph(String isbn) {
		return bookdao.getBook(isbn);
		
	}

}




