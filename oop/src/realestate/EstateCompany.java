package realestate;

import java.util.ArrayList;

public class EstateCompany {
	private String name;
	private String owner;
	private int bulstat;
	private ArrayList<Employee> employees;
	private ArrayList<Estate> estates;
	
	public EstateCompany (String name, String owner, int bulstat) {
		this.name = name;
		this.owner = owner;
		this.bulstat = bulstat;
		this.employees = new ArrayList<Employee>();
		this.estates = new ArrayList<Estate>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBulstat() {
		return bulstat;
	}

	public void setBulstat(int bulstat) {
		this.bulstat = bulstat;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public ArrayList<Estate> getEstates() {
		return estates;
	}

	public void setEstates(ArrayList<Estate> estates) {
		this.estates = estates;
	}
	
	public void addEmployee (Employee employee) {
		this.employees.add(employee);
	}
	
	public void addEstate (Estate estate) {
		this.estates.add(estate) ;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("< " + this.name + " >" + "\n");
		result.append("Owner: " + this.owner + "\n");
		result.append("BULSTAT: " + this.bulstat + "\n");
		result.append("- - - - List of employees - - - - - \n");
		for (Employee employee : this.employees) {
			result.append(employee );			
		}
		result.append("- - - - List of estates - - - - -\n");
		for (Estate estate : this.estates) {
			result.append(estate );
			result.append("\n");
		}
		return result.toString();
	}
}
