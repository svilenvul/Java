package filesystem;


public class TextFile extends File {
	private String content = null;	
	
	TextFile(String name) {
		this(name,null,null);
	}
	
	TextFile (String name, String dateOfCreation, String dateOfLastChange) {
		super(name, dateOfCreation, dateOfLastChange);
		this.content = new String();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString () {
		String result = super.getName() + ".txt";
		return result;		
	}
}
