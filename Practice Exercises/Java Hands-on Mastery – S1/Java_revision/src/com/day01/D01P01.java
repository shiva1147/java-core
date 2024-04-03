package com.day01;

class Book {
	String book_title;
	double book_price;
	
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double price) {
		this.book_price = price;
	}
	
}

public class D01P01 {
	
	public static void createBooks(Book book,String title, double price) {
		book.setBook_title(title);
		book.setBook_price(price);
	}

	public static void showBooks(Book book) {
		System.out.println("Book Title : " + book.getBook_title() + " and Price : " + book.getBook_price() );
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		
		String title = "Java Programming";
		double price = 350.00;
		createBooks(book, title, price);
		showBooks(book);
		
	}

}

	