package com.learning.core.day1;

class Book {
    private String bookTitle;
    private double bookPrice;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
public class D01P01 {
	
	public static Book createBooks(String title, double price) {
	    
        Book book = new Book();
        book.setBookTitle(title);
        book.setBookPrice(price);
        return book;
    }

    
    public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
    }
public static void main(String[] args) {
	Book book = createBooks("java programming",350);
    showBooks(book);
}
}
