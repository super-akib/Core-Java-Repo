package com.akib.treeset;

public record Book(String bookName,String authorName) implements Comparable<Book>
{

	@Override
	public int compareTo(Book book)
	{
	   return this.bookName.compareTo(book.bookName);
	}
     
}
