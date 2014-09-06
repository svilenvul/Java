package filesystem;

import java.util.TreeSet;

public class FileSystem {
	private TreeSet<Drive> devices;
	
	FileSystem() {
		this.devices = new TreeSet<Drive>();
	}
	
	public void addDevice (Drive device) {
		devices.add(device);
	}
	
	public void removeDevice (Drive device) {
		devices.remove(device);
	}

	public TreeSet<Drive> getDevices() {
		return devices;
	}

	public void setDevices(TreeSet<Drive> devices) {
		this.devices = devices;
	}	
	
}
