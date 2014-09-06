package realestate;

public class Estate {
	private int area;
	private int pricePerSquareMeter;
	private String locality;
	
	public Estate (int area, int pricePerSquareMeter, String locality) {
		this.area = area;
		this.pricePerSquareMeter = pricePerSquareMeter;
		this.locality = locality;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPricePerSquareMeter() {
		return pricePerSquareMeter;
	}

	public void setPricePerSquareMeter(int pricePerSquareMeter) {
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}	

}
