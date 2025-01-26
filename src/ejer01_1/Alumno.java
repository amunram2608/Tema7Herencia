package ejer01_1;

public class Alumno extends Persona{

	public Alumno(String nombre, int edad, String sexo, String nacionalidad) {
		super(nombre, edad, sexo, nacionalidad);
	}

	
	private boolean repetidor;
	
	
	boolean isRepetidor() {
		return repetidor;
	}
	
	void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}
	
	
	@Override
    public String toString() {
        return super.toString() + ", Alumno [Repetidor=" + repetidor + "]";
    }
	
}
