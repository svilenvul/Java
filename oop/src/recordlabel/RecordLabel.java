package recordlabel;

import java.util.HashSet;

public class RecordLabel {
	private String name = null;
	private String address = null;
	private String owner = null;
	private HashSet <Singer> singers;
	
	public RecordLabel (String name, String address, String owner) {
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.singers = new HashSet <Singer>();
	}
	
	public void addSinger (Singer singer) {
		singers.add(singer);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override 
	public String toString () {
		StringBuilder result = new StringBuilder();
		result.append( "<" + this.name + ">" + "\n");
		result.append("Adrress: " + this.address + "\n");
		result.append("Owner: " + this.owner + "\n");		 
		result.append("\n");		 			
		for (Singer singer : this.singers) {
			result.append(singer);
			result.append("\n");
		}
		return result.toString();					
	}	
}
