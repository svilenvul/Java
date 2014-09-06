package realestate;


public class House extends Estate{
	private int builtUpArea;
	private int yardArea;
	private int numberOfStoreys;
	private boolean isFurnished;
	
	public House (int area, int pricePerSquareMeter, String locality,
			int builtUpArea, int yardArea, int numberOfStoreys, boolean isFurnished) {
		super(area, pricePerSquareMeter, locality);
		this.builtUpArea = builtUpArea;
		this.yardArea = yardArea;
		this.numberOfStoreys = numberOfStoreys;
		this.isFurnished = isFurnished;
	}

	public int getBuiltUpArea() {
		return builtUpArea;
	}

	public void setBuiltUpArea(int builtUpArea) {
		this.builtUpArea = builtUpArea;
	}

	public int getYardArea() {
		return yardArea;
	}

	public void setYardArea(int yardArea) {
		this.yardArea = yardArea;
	}

	public int getNumberOfStoreys() {
		return numberOfStoreys;
	}

	public void setNumberOfStoreys(int numberOfStoreys) {
		this.numberOfStoreys = numberOfStoreys;
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
		result.append("House: " + super.getArea() + "sq.m., ");
		result.append(super.getPricePerSquareMeter() + "Euro/sq.m., ");
		result.append(super.getLocality());	
		result.append(builtUpArea + "sq.m. built up area, ");
		result.append(yardArea + "sq.m. yard area, ");
		result.append(numberOfStoreys + "storeys, ");
		result.append("furnished: " + isFurnished);
		return result.toString();
	}
}
