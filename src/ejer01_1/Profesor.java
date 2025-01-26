package ejer01_1;

public class Profesor extends Persona{

	public Profesor(String nombre, int edad, String sexo, String nacionalidad) {
		super(nombre, edad, sexo, nacionalidad);
	}

	
	private double sueldo;
	
	
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
