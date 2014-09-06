package realestate;


public class RealEstateTest {
	public static void main (String[] args) {
		EstateCompany estateCompany = new EstateCompany ("Green Estate","John Machintosh",3453643);
		Employee[] all = {				
				new Employee ("Benjamin Fluenta", "worker", 1.0)
		};
		for (Employee employee : all) {
			estateCompany.addEmployee(employee);
		}
		House N234 = new House (250, 200, "Othmarshen", 120, 400, 2, false);
		Apartment N453 = new Apartment (80, 120, "Wilhelmsburg", 3, false, true);
		RealEstate N235 = new RealEstate (800, 40, "Harburg");
		RealEstate N236 = new RealEstate (800, 40, "Harburg");
		
		estateCompany.addEstate(N234);
		estateCompany.addEstate(N235);
		estateCompany.addEstate(N453);
		estateCompany.addEstate(N235);
		estateCompany.addEstate(N236);
		System.out.print(estateCompany);
		
	}
}
