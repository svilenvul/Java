package bibliothek;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Bibliothek {
	
	private HashMap<String,HashSet<Book>> booksByAuthor ;
	private HashMap<String,HashSet<Book>> booksByName;	
	
	public Bibliothek() {
		booksByAuthor = new HashMap<String,HashSet<Book>>();
		booksByName = new HashMap<String,HashSet<Book>>();		
	}
	
	public Collection<Book> getAllBooks () {
		Collection<Book> allBooks = new ArrayList<Book>();
		Collection<HashSet<Book>> allBookSets = booksByAuthor.values();
		if (!allBookSets.isEmpty()) {
			for(HashSet<Book> bookSet : allBookSets) {
				allBooks.addAll(bookSet);
			}
		}		
		return allBooks;
	}
	
	public void printAllBooks () {
		Collection<Book> books = this.getAllBooks();
		for (Book book : books) {
			System.out.println(book);
		}
	}		
	public void addBook (Book book) {
		HashSet<Book> books;
		String author = book.getAutor();
		if(booksByAuthor.containsKey(author)) {
			books = booksByAuthor.get(author);
		} else {
			books = new HashSet<Book>();
		}
		books.add(book);		
		booksByAuthor.put(author, books);		
		
		String name = book.getName();
		if(booksByName.containsKey(name)) {
			books = booksByName.get(name);
		} else {
			books = new HashSet<Book>();
		}
		books.add(book);		
		booksByName.put(author, books);			
	}	
	public void deleteBook (Book book) {		
		String author = book.getAutor();
		if(booksByAuthor.containsKey(author)) {			
			HashSet<Book> booksFromAutor = booksByAuthor.get(author);
			booksFromAutor.remove(book);
			booksByAuthor.put(author, booksFromAutor);				
		} 
			
		String name = book.getName();
		if(booksByName.containsKey(name)) {			
			HashSet<Book> booksWithName = booksByName.get(name);
			booksWithName.remove(book);
			booksByName.put(author, booksWithName);				
		} 
	}	
	public void deleteAllBooks () {
		booksByAuthor = new HashMap<String,HashSet<Book>> ();
		booksByName = new HashMap<String,HashSet<Book>> ();
	}	
	public HashSet <Book> searchByName (String name) {
		HashSet <Book> books;
		if (booksByName.containsKey(name)) {
			books = booksByName.get(name);
		} else {
			 books = new HashSet<Book>();
		}
		return books;
	}	
	public HashSet <Book> searchByAuthor(String author) {
		HashSet <Book> books;
		if (booksByAuthor.containsKey(author)) {
			books = booksByAuthor.get(author);
		} else {
			 books = new HashSet<Book>();
		}
		return books;
	}
			
}
