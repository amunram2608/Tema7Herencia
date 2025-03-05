package ejer04;

public class Profesor extends Persona implements Validate, IncreaseSalary{
	
	private float sueldo;
	private static int number;
	
	public Profesor(String name, float sueldo) {
		super(name);
		this.sueldo = sueldo;
		numberObject = ++number;
	}
	
	public boolean isValidate() {
		return isValidate;
	}

	public String numberType() {
		return "Soy el profesor número " + numberObject;
	}
	
	@Override
	public boolean validate() {
		return isValidate = true;
	}
	
	@Override
	public void increaseSalary(float percentaje) {
		sueldo += sueldo*(percentaje/100);
	}

	@Override
	public String toString() {
		return "Profesor " + name + " , " + (isValidate() ? "Sí validado" : "No validado") + " , " + sueldo;
	}
	
	
}
