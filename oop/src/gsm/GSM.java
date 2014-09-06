package gsm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class GSM {
	
	private String model;
	private String producer;
	private double price;
	private String owner;
	private Battery battery;
	private Display display;
	private ArrayList <Call> calls;
		
	public GSM () {
		this(null);
	}	
	public GSM (String model) {
		this(model, null);
	}	
	public GSM (String model, String producer) {
		this(model, producer, 0);
	}	
	public GSM (String model, String producer, double price) {
		this(model, producer, price, null);
	}	
	public GSM (String model, String producer, double price, String owner) {
		this.model = model;
		this.producer = producer;
		this.price = price;
		this.owner = owner;	
		this.display = new Display();
		this.battery = new Battery();
		this.calls = new ArrayList<Call>();
	}	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
			
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public Display getDisplay() {
		return display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	
	public boolean addCall (Call call) {
		return this.calls.add(call);
	}
	
	public boolean removeCall (Call call) {
		return this.calls.remove(call);
	}	
	public ArrayList<Call> getCalls () {
		return this.calls;
	}
	
	public void printTelInfo () {
		System.out.println("The model of the telephone is: " + this.model);
		System.out.println("The producer of the telephone is: " + this.producer);
		System.out.println("The price of the telephone is: " + this.price + "euro");
		System.out.println("The name of his owner is: " + this.owner);		
		this.battery.printInfo();
		this.display.printInfo();
	}	
	public void printCallHistory(int numberOfCalls) {
		ArrayList<Call> calls = this.getCalls();
		if (numberOfCalls > calls.size()) {
			numberOfCalls = calls.size();
		}
		for (int i = 0;i < numberOfCalls; i++){
			calls.get(i).printCall();
		}
	}
}





