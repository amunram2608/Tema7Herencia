package ejer04;

import java.util.Arrays;

public class Alumno extends Persona implements Validate, PutMark{

	private final int numberMarks = 3;
	private int[] marks = new int[numberMarks];
	private static int number;
	
	public Alumno(String name) {
		super(name);
		Arrays.fill(marks, -1);
		numberObject = ++number;
	}
	
	public boolean isValidate() {
		return isValidate;
	}
	
	public String numberType() {
		return "Soy el alumno número " + numberObject;
	}
	
	@Override
	public boolean validate() {
		return isValidate = true;
	}
	
	@Override
	public void putMark(int mark) {
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] == -1) {
				marks[i] = mark;
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "Alumno " + name + " , " + (isValidate() ? "Sí validado" : "No validado");
	}
	
	
	
}
