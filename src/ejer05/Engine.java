package ejer05;

public class Engine extends Vehicle{
	
	private int displacement;
	private String fuelType;
	
	public Engine(int displacement, String fuelType) {
		super();
		this.displacement = displacement;
		this.fuelType = fuelType;
	}
	
	public int getDisplacement() {
		return displacement;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Engine [displacement=" + displacement + ", fuelType=" + fuelType + "]";
	}
	
}