package school;

import java.util.Hashtable;
import java.util.Set;

public class Programme {
	private Hashtable<Class,Set<Discipline>> programme;
	
	public Programme() {
		this.programme = new Hashtable<Class,Set<Discipline>>();  
	}
	
	public Set<Discipline> getDiscilpines (Class schoolClass){
		return this.programme.get(schoolClass);
	}
	
	public boolean addDiscipline (Class schoolClass,Discipline discipline) {
		Set<Discipline> discilpines = this.getDiscilpines(schoolClass);
		boolean isAdded =discilpines.add(discipline);
		this.programme.put(schoolClass, discilpines);
		return isAdded;
	}
	
	public boolean removeDiscipline (Class schoolClass,Discipline discipline) {
		Set<Discipline> discilpines = this.getDiscilpines(schoolClass);
		boolean isRemoved = discilpines.remove(discipline);
		this.programme.put(schoolClass, discilpines);
		return isRemoved;
	}
}
