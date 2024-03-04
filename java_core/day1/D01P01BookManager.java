package com.learning.core.day1;

public class D01P01BookManager {
	public class BookManager{
		public static D01P01Book createBook(String title,double price) {
			D01P01Book book=new D01P01Book();
			book.setBookTitle(title);
			book.setBookPrice(price);
			return book;
		}
		public static void showBook(D01P01Book book) {
	    System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
	}
		public static void main(String[] args) {
			D01P01Book myBook= createBook("Java Programming",350.00);
			showBook(myBook);
		}
	}
}
