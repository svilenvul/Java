package recordlabel;

import java.util.ArrayList;

public class Album {
	private String name = null;
	private Genre genre;
	private int creationYear = 0;
	private int numberOfSells = 0;
	private ArrayList<Song> songs;
	
	Album (String name, Genre genre, int creationYear, int numberOfSells) {
		this.name = name;
		this.genre = genre;
		this.creationYear = creationYear;
		this.numberOfSells = numberOfSells;
		this.songs = new ArrayList<Song>();
	}
	
	public void addSong (Song song) {
		this.songs.add(song);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public int getNumberOfSells() {
		return numberOfSells;
	}

	public void setNumberOfSells(int numberOfSells) {
		this.numberOfSells = numberOfSells;
	}
	
	@Override 
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Album: " + this.name + "\n");
		result.append("Genre: " + this.genre + "\n");
		result.append("Year of creation: " + this.creationYear + "\n");
		result.append("Number of copies: " + this.numberOfSells + "\n");
		result.append("- - - - - - List of songs - - - - - -" + "\n");
		for (Song song : this.songs) {
			result.append(song);
			result.append("\n");
		}
		
		return result.toString();
	}
}
