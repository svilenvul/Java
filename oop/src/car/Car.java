package car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Car {
	
	private static SimpleDateFormat formater = new SimpleDateFormat("yyyy.MM.dd",Locale.ENGLISH) ;
	private String brand;
	private String model;
	private String colour;
	private Date dateProduction;
	private int price;
	
	
	Car (String brand, String model, String colour, String dateProduction, int price) throws ParseException {
		this.brand = brand;
		this.model = model;
		this.colour = colour;		
		Date production = formater.parse(dateProduction);
		this.dateProduction = production;
		this.price = price;		
	}	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Date getDateProduction() {		
		return dateProduction;
	}

	public void setDateProduction(Date dateProduction) {
		
		this.dateProduction = dateProduction;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString (){
		return this.getBrand()+" " + this.getModel() + ", " +
				this.getColour() +", " + formater.format(this.getDateProduction()) + 
				", " + this.getPrice() + " Euro";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result
				+ ((dateProduction == null) ? 0 : dateProduction.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (dateProduction == null) {
			if (other.dateProduction != null)
				return false;
		} else if (!dateProduction.equals(other.dateProduction))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}
