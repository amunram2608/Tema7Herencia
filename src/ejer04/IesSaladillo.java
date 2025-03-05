package ejer04;

public class IesSaladillo {
	
	public static Persona[] createObjects() {
		Persona[] personas = new Persona[8];
		personas[0] = new Alumno("Maria Espinosa");
		personas[1] = new Alumno("Jose Valverde");
		personas[2] = new Alumno("Juan Ruiz");
		personas[3] = new Alumno("Pepe Perez");
		personas[4] = new Alumno("Rosa Mancebo");
		personas[5] = new Profesor("Eva Rojas", 1500);
		personas[6] = new Profesor("Ana Mijas", 1700);
		personas[7] = new Profesor("Javier Cuevas", 1200);
		return personas;
	}
	
	public void showOrder(Persona[] personas) {
		for (int i = 0; i < personas.length; i++) {
			if (personas[i] instanceof Alumno) {
				Alumno alumno = (Alumno) personas[i];
				System.out.println(alumno.numberType());
			}
			if (personas[i] instanceof Profesor) {
				Profesor profesor = (Profesor) personas[i];
				System.out.println(profesor.numberType());
			}
		}
	}
	
	public void showObjects(Persona[] personas) {
		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i]);
		}
	}
	
	public void show() {
		new ejer04.IesSaladillo().showOrder(IesSaladillo.createObjects());
		System.out.println();
		new ejer04.IesSaladillo().showObjects(IesSaladillo.createObjects());
	}
	
	public static void main(String[] args) {
		new ejer04.IesSaladillo().show();
	}

}
