package filesystem;


public class BinaryFile extends File {
	private byte [] content = null;	
	
	BinaryFile (String name) {
		this(name, null, null);
	}
	
	BinaryFile (String name, String dateOfCreation, String dateOfLastChange) {
		super(name, dateOfCreation, dateOfLastChange);
		this.content = new byte [100];
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}
	
	@Override
	public String toString () {
		String result = super.getName() + ".bin";
		return result;		
	}
	
}
