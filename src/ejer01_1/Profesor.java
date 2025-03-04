package ejer01_1;

public class Profesor extends Persona{

	private double sueldo;
	
	public Profesor(String nombre, int edad, String sexo, String nacionalidad, double sueldo) {
		super(nombre, edad, sexo, nacionalidad);
		this.sueldo = sueldo;
	}
	
	
	double getSueldo() {
		return sueldo;
	}
	
	void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	@Override
    public String toString() {
        return super.toString() + ", Profesor [Sueldo=" + sueldo + "]";
    }
	
}
