package filesystem;

import java.util.TreeSet;

public class Drive implements Comparable<Drive> {
	private String name = null;
	private Type type;		
	private TreeSet<Directory> dirs;
	private TreeSet<File> files;
	
	public Drive (String name, Type type) {
		this.name = name;
		this.type = type;
		this.dirs = new TreeSet<Directory>();
		this.files = new TreeSet<File>();
	}
	
	public void addDir (Directory dir){
		dirs.add(dir);		
	}
	
	public void removeDir (Directory dir) {
		dirs.remove(dir);
	}
	
	public void addFile (File file) {
		files.add(file);
	}
	
	public void removeFile (File file) {
		files.remove(file);
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public TreeSet<Directory> getDirs() {
		return dirs;
	}

	public void setDirs(TreeSet<Directory> dirs) {
		this.dirs = dirs;
	}

	public TreeSet<File> getFiles() {
		return files;
	}

	public void setFiles(TreeSet<File> files) {
		this.files = files;
	}
	
	@Override
	public int compareTo (Drive other) {
		int nameDiff = name.compareTo(other.name);
		return nameDiff;
	}
	
	@Override 
	public String toString() {
		String result = name + ":\\";
		return result;
	}	
	
	public void dir () {
		for (File file : files) {
			System.out.println(this.name + ":\\" + file);
		}
		for (Directory dir : dirs) {
			System.out.println(this.name + ":\\" + dir);
		}
	}
}
