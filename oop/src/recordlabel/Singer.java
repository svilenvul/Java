package recordlabel;

import java.util.ArrayList;

public class Singer {
	private String name =  null;
	private String alias =  null;
	private ArrayList <Album> albums;
	
	public Singer (String name, String alias) {
		this.name = name;
		this.alias = alias;
		this.albums = new ArrayList<Album>();
	}
	
	public void addAlbum (Album album) {
		this.albums.add(album);
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Singer: " + this.name + "\n");
		result.append("Alias: " + this.alias + "\n");
		result.append("- - - - - Albums - - - - -" + "\n");
		for (Album album : this.albums) {
			result.append(album);
			result.append("\n");
		}
		return result.toString();
	}
}
