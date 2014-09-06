package realestate;


public class RealEstate extends Estate {
	public RealEstate (int area, int pricePerSquareMeter, String locality) {
		super (area, pricePerSquareMeter, locality);
	}
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Real Estate: " + super.getArea() + "sq.m., ");
		result.append(super.getPricePerSquareMeter() + "Euro/sq.m., ");
		result.append(super.getLocality() + ", ");		
		return result.toString();
	}
}
