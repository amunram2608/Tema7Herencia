package ejer05;

public class Vehicle {

	private String brand;
	private String model;
	private Engine engine;
	
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
	
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", engine=" + engine + "]";
	}
	
	public Engine installEngine(int displacement, String typeFuel) {
		Engine engine = new Engine(displacement, typeFuel);
		this.engine = engine;
		return engine;
	}
			
	
}
