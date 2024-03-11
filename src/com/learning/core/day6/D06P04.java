package com.learning.core.day6;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

class Book implements Comparable<Book>
{
	private int bookId;
	private String title;
	private double price;
	private Date dateOfPublication;
	private String author;
	
	public Book() {
		super();
	}

	public Book(int bookId, String title, double price, Date dateOfPublication, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.dateOfPublication = dateOfPublication;
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getdOfPubl() {
		return dateOfPublication;
	}

	public void setdOfPubl(Date dOfPubl) {
		this.dateOfPublication = dateOfPublication;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, dateOfPublication, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookId == other.bookId && Objects.equals(dateOfPublication, other.dateOfPublication)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return bookId + " " + title + " " + price + " "+ author+" " 
				+ dateOfPublication.getDate()+"/"+dateOfPublication.getMonth()+"/"+dateOfPublication.getYear();
	}

	@Override
	public int compareTo(Book o) 
	{
		return this.author.compareTo(o.author);
	}
	
	
}
@SuppressWarnings("deprecation")
public class D06P04 
{
	public static void main(String[] args) 
	{
		TreeSet<Book> book= new TreeSet<>();
		
		book.add(new Book(1001,"Python Learning",715,new Date(2020,2,2),"Martic C. Brown"));
		book.add(new Book(1002,"Modern Mainframe",295,new Date(1997,5,19),"Sharad"));
		book.add(new Book(1003,"java Programming",523,new Date(1984,11,23),"Gilad Bracha"));
		book.add(new Book(1004,"Read C++",295,new Date(1984,11,19),"Henry Harvin"));
		book.add(new Book(1005,".Net Platform",3497,new Date(1984,3,6),"Mark J. Price"));
		
		
		for (Book bk : book) 
		{
            System.out.println(bk);
        }
	}

}