package filesystem;

public class Directory  extends Drive {
	
	Directory (String name) {
		super(name,Type.DIRECTORY);	
	}
	
	public void addDir (Directory dir) {
		super.getDirs().add(dir);
	}
	
	public void removeDir (Directory dir) {
		super.getDirs().remove(dir);
	}
	
	public void addFile (File file) {
		super.getFiles().add(file);
	}
	
	public void removeFile (File file) {
		super.getFiles().remove(file);
	}		
		
	@Override
	public String toString() {		
		String result = super.getName() + "\\";
		return result;
	}
	
	public void dir() {
		for (Directory dir : super.getDirs())  {
			System.out.println(super.getName() + "\\" + dir);
		}
		for (File file : super.getFiles()) {
			System.out.println(super.getName() + "\\" + file);
		}
	}
}
