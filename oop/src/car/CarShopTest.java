package car;

import java.text.ParseException;
import java.util.*;

public class CarShopTest {

	public static void main(String[] args) throws ParseException  {
		Car Nr1 = new Car("Volkswagen","Golf 1.4" ,"blue","2000.05.12",1200);
		Car Nr2 = new Car("BMW","730","black","2003.04.01",2000);
		Car Nr3 = new Car("Seat","Cordoba 1.9 TDI Vario","blue","2001.12.02",1100);
		Car Nr4 =  new Car("Volkswagen","Golf Variant 1.6 Comfortline","blue","2000.02.13",1100);
			
		CarShop shop = new CarShop();
		
		shop.addCar(Nr1);
		shop.addCar(Nr2);
		shop.addCar(Nr3);
		shop.addCar(Nr4);

		HashSet<Car> bmws = shop.searchByBrand("BMW");
		for(Car bmw : bmws) {
			System.out.println(bmw);
		}
		
		HashSet<Car> blackCars = shop.searchByColour("blue");
		for(Car bmw : blackCars) {
			System.out.println(bmw);
		}
		
		HashSet<Car> golfs = shop.searchByModel("Golf 1.4");
		for(Car bmw : golfs) {
			System.out.println(bmw);
		}
		System.out.println("price");
		HashSet<Car> price2000 = shop.searchByPrice(1000,2100);
		for(Car bmw : price2000) {
			System.out.println(bmw);
		}		
	
		
	}

}
