package com.akib.treeset;

import java.util.Set;
import java.util.TreeSet;

public class BookSorted 
{
     
	public static void main(String[] args)
	{
		Book book1 = new Book("Let Us-C", "Yashwant Kanetkar");
		Book book2 = new  Book("ANSI", "E. Balgurswamy");
		Book book3 = new  Book("Wings Of Fire", "APJ Kalam");
		Book book4 = new  Book("Madhusala", "Harivansh Rai");
		Book book5 = new  Book("The Little Prince", "Antoine de Saint-Exupéry");
		
		Set<Book>  treeSet = new TreeSet<>((b1,b2)->b1.bookName().compareTo(b2.bookName()));
		treeSet.add(book4);
		treeSet.add(book5);
		treeSet.add(book1);
		treeSet.add(book2);
		treeSet.add(book3);
		
		treeSet.forEach(System.out::println);
		
		
	}
}
