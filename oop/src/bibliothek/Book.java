package bibliothek;

public class Book {
	private String publisher;
	private String name = null;
	private String autor = null;
	private int year;
	private String ISBN;
	
	public Book (String name, String autor) {
		this (null, null, null);
	}
	public Book (String name, String autor, String publisher) {
		this (null, null, null, 0);
	}
	public Book (String name, String autor, String publisher,int year) {
		this (null, null, null, 0, null);
	}
	public Book (String name, String autor, String publisher,int year, String ISBN) {
		this.name = name;
		this.autor = autor;
		this.publisher = publisher;
		this.year = year;
		this.ISBN = ISBN;	
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getISBN() {
		return this.ISBN;
	}
	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}
	@Override
	public String toString() {
		return "Title: " + this.name + ", Author: " + this.autor + ", " + this.publisher + ",From: " + this.year + ",ISBN: " + this.ISBN;
	}
}
