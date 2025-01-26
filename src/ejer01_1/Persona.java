package ejer01_1;

public class Persona {
	
	public Persona(String nombre, int edad, String sexo, String nacionalidad) {
		setNombre(nombre);
		setEdad(edad);
		setSexo(sexo);
		setNacionalidad(nacionalidad);
	}
	
	
	protected String nombre;
	protected int edad;
	protected String sexo;
	protected String nacionalidad;
	
	
	String getNombre() {
		return nombre;
	}
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	int getEdad() {
		return edad;
	}
	
	void setEdad(int edad) {
		this.edad = edad;
	}
	
	String getSexo() {
		return sexo;
	}
	
	void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	String getNacionalidad() {
		return nacionalidad;
	}
	
	void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	@Override
    public String toString() {
        return "Persona [Nombre=" + nombre + ", Edad=" + edad + ", Sexo=" + sexo + ", Nacionalidad=" + nacionalidad + "]";
    }
}
