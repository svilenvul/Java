package realestate;


public class Shop extends Estate{
	public Shop (int area, int pricePerSquareMeter, String locality) {
		super (area, pricePerSquareMeter, locality);
	}
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Shop: " + super.getArea() + "sq.m., ");
		result.append(super.getPricePerSquareMeter() + "Euro/sq.m., ");
		result.append(super.getLocality() + ", ");		
		return result.toString();
	}
}
