package filesystem;

/**
 * Takes files and folders from the system and create instances with the same
 * name
 */

public class FileExtractor {

	// The program is slow, it is not good tested
	public static void main(String[] args) {
		FileSystem my = new FileSystem();
		java.io.File[] drives = java.io.File.listRoots();
		createDrives(my, drives);
		System.exit(0);
	}

	public static void createDrives(FileSystem my, java.io.File[] drives) {
		for (java.io.File drive : drives) {
			Drive myDrive = new Drive(drive.getName(), Type.HARD_DRIVE);
			java.io.File[] filesAndFolders = drive.listFiles();
			createFilesAndFolders(myDrive, filesAndFolders);
		}
	}

	public static void createFilesAndFolders(Drive myDevice,
			java.io.File[] children) {
		if (children == null) {
			return;
		}
		if (children.length == 0) {
			return;
		}

		for (java.io.File child : children) {
			if (child.isDirectory()) {
				Directory myDir = new Directory(child.getName());
				myDevice.addDir(myDir);
				java.io.File[] newChildren = child.listFiles();
				createFilesAndFolders(myDir, newChildren);
			} else {
				myDevice.addFile(new TextFile(child.getName()));
			}
		}
		return;
	}

}
 