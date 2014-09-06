package car;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class CarShop {	
	private HashMap <String, HashSet <Car>> carsByBrand;
	private HashMap <String, HashSet <Car>> carsByModel;
	private HashMap <String, HashSet <Car>> carsByColour;
	private TreeMap <Integer, HashSet <Car>> carsByPrice;
	private TreeMap < Date, HashSet <Car>> carsByProductionDate;
	
	public CarShop() {		
		carsByBrand =  new HashMap <String, HashSet <Car>>();
		carsByModel = new HashMap <String, HashSet <Car>>();
		carsByColour =  new HashMap <String, HashSet <Car>>();
		carsByPrice = new TreeMap <Integer, HashSet <Car>>();
		carsByProductionDate = new TreeMap <Date, HashSet <Car>>();
	}
	
	public void addCar (Car car) {
		HashSet <Car> cars;
		String brand = car.getBrand();
		if (!carsByBrand.containsKey(brand)) {
			cars = new HashSet <Car>();
		} else{
			cars =  carsByBrand.get(brand);			
		}
		cars.add(car);
		carsByBrand.put(brand, cars);	
		
		String model = car.getModel();
		if (!carsByModel.containsKey(model)) {
			cars = new HashSet <Car>();
		} else{
			cars =  carsByModel.get(model);			
		}
		cars.add(car);
		carsByModel.put(model, cars);
		
		String colour = car.getColour();
		if (!carsByColour.containsKey(colour)) {
			cars = new HashSet <Car>();
		} else{
			cars =  carsByColour.get(colour);			
		}
		cars.add(car);
		carsByColour.put(colour, cars);		
		
		Date dateProduction = car.getDateProduction();
		if (!carsByProductionDate.containsKey(dateProduction)) {
			cars = new HashSet <Car>();
		} else{
			cars =  carsByProductionDate.get(dateProduction);			
		}
		cars.add(car);
		carsByProductionDate.put(dateProduction, cars);	
		
		int price = car.getPrice();
		if (!carsByPrice.containsKey(price)) {
			cars = new HashSet <Car>();
		} else{
			cars =  carsByPrice.get(price);			
		}
		cars.add(car);
		carsByPrice.put(price, cars);	
		
	}
	
	public void deleteCar () {
		
	}
	
	public HashSet <Car> searchByBrand (String brand) {
		HashSet <Car> cars;
		if (carsByBrand.containsKey(brand)) {
			cars = carsByBrand.get(brand);	
		} else{
			cars = new HashSet<Car>(); 		
		}
		return cars;
	}
	
	public HashSet <Car> searchByModel (String model) {
		HashSet <Car> cars;
		if (carsByModel.containsKey(model)) {
			cars = carsByModel.get(model);	
		} else{
			cars = new HashSet<Car>();  		
		}
		return cars;
	}
	
	public HashSet <Car> searchByColour (String colour) {
		HashSet <Car> cars;
		if (carsByColour.containsKey(colour)) {
			cars = carsByColour.get(colour);	
		} else{
			cars = new HashSet<Car>(); 		
		}
		return cars;
	}
	
	public HashSet <Car> searchByProductionDate (Date from,Date to) {
		HashSet <Car> cars = new HashSet<Car>();;
		Collection <HashSet<Car>> setsInRange = carsByProductionDate.subMap(from, to).values();
		if (!setsInRange.isEmpty()) {
			for (HashSet<Car> carsInRange : setsInRange) {
				cars.addAll(carsInRange);
			}
		} 
		return cars;		
	}
	
	public HashSet <Car> searchByPrice (int from, int to) {
		HashSet <Car> cars = new HashSet<Car>();;
		Collection <HashSet<Car>> setsInRange = carsByPrice.subMap(from, to).values();
		if (!setsInRange.isEmpty()) {
			for (HashSet<Car> carsInRange : setsInRange) {
				cars.addAll(carsInRange);
			}
		} 
		return cars;		
	}

}
