package com.core.criteriaassigment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookid;
	String bookname;
	String author;
	double price;
	int qty;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookname, String author, double price, int qty) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", Bookname=" + bookname + ", author=" + author + ", price=" + price
				+ ", qty=" + qty + "]";
	}
	
	
	
	
	

}
