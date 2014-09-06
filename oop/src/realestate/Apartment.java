package realestate;


public class Apartment extends Estate {
	private int floorNumber;
	private boolean hasElevator;
	private boolean isFurnished;

	public Apartment(int area, int pricePerSquareMeter, String locality,
			int floorNumber, boolean hasElevator, boolean isFurnished) {
		super(area, pricePerSquareMeter, locality);
		this.floorNumber = floorNumber;
		this.hasElevator = hasElevator;
		this.isFurnished = isFurnished;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public boolean isHasElevator() {
		return hasElevator;
	}

	public void setHasElevator(boolean hasElevator) {
		this.hasElevator = hasElevator;
	}

	public boolean isFurnished() {
		return isFurnished;
	}

	public void setFurnished(boolean isFurnished) {
		this.isFurnished = isFurnished;
	}	
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Apatment: " + super.getArea() + "sq.m., ");
		result.append(super.getPricePerSquareMeter() + "Euro/sq.m., ");
		result.append(super.getLocality() + ", ");
		result.append(floorNumber + "floor, ");
		result.append("elevator: "  + hasElevator + ", ");
		result.append("furnished: " + isFurnished);
		return result.toString();
	}
}
