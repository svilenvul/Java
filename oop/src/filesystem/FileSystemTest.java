package filesystem;


public class FileSystemTest {

	public static void main(String[] args) {
		FileSystem my = new FileSystem();
		Drive c = new Drive("C",Type.HARD_DRIVE);
		Drive d = new Drive("D",Type.HARD_DRIVE);
		Drive f = new Drive("F",Type.REMOVABLE_DISK);
		
		my.addDevice(d);
		my.addDevice(c);
		my.addDevice(f);
		
		Directory programmFiles = new Directory("ProgrammFiles");
		Directory windows = new Directory("Windows");
		Directory photos = new Directory("Photos");
		BinaryFile boot = new BinaryFile("boot");
		
		c.addDir(windows);
		c.addDir(programmFiles);
		c.addFile(boot);
		d.addDir(photos);
		
		TextFile readme = new TextFile("ReadMe");
		TextFile Hamburg = new TextFile("Hamburg");
		windows.addFile(readme);
		windows.addFile(boot);
		photos.addFile(Hamburg);
		
		c.dir();
		photos.dir();
		System.out.print(windows);
	

	}

}
