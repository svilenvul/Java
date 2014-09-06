package url;

public class URL {
	String protocol;
	String server;	
	String resource;
	
	public URL(String protocol,String server,String resource) {
		this.protocol = protocol;
		this.server = server;
		this.resource = resource;
	}
	
	public static URL createFromString(String urlString) {
		String [] temp = urlString.split("(://)+|/",3);
		return new URL(temp[0],temp[1],temp[2]);
	}
	
	@Override
	public String toString() {
		String result = "[protocol] =\"" +this.protocol + "\"\n" + 
				"[server] =\"" + this.server + "\"\n" + 
				"[resource] =\"" + this.resource + "\"\n";
		return result;
	}
	
}

