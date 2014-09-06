package bibliothek;

import java.util.HashSet;

public class BibliothekTest {

	public static void main(String[] args) {
		Book new1 = new Book("Das Meer und kleine Fishe", "Terry Pratchet", "Heyne Bucher", 0 , "3-453-17197-7");
		Book new2 = new Book("Lehr- und Ubungsbuch der deutschen Grammatik", "Dryer, Schmidt", "Lettera", 2000 , "954-516-281-3");
		Book new3 = new Book("Journey to the Centre of the Earth", "Jules Verne", "Pengiuin Books", 1994 , "978-0-14062-425-0");
		Book new4 = new Book("Rattenkonig", "James Clavell", "Knaur", 1993, "3-426-60133-8");
		
		Bibliothek myBibl = new Bibliothek();
		myBibl.addBook(new1);
		myBibl.addBook(new2);
		myBibl.addBook(new3);
		myBibl.addBook(new4);
		
		myBibl.printAllBooks();
		System.out.println();
		myBibl.deleteBook(new3);
		myBibl.printAllBooks();
		System.out.println();
		HashSet<Book> dryesrsBook = myBibl.searchByAuthor(new2.getAutor());
		for(Book book : dryesrsBook) {
			System.out.println(book);
		}
		
	}

}
