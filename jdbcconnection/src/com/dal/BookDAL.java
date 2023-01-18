package com.dal;

import java.util.List;

import com.pojo.Book;

public interface BookDAL {
	
	List<Book> getallBooks();
	
    int addBook(Book obj);
    int updateBook(Book obj);
    int deleteBook(int id);
}
