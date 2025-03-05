package ejer05;

public class Main {
	
	public void show() {
		Vehicle vehiculo1 = new Vehicle();
		System.out.println(vehiculo1);
		vehiculo1.setBrand("Opel");
		vehiculo1.setModel("0GSTR");
		vehiculo1.installEngine(34, "gasolina");
		System.out.println(vehiculo1);
	}
	
	public static void main(String[] args) {
		new ejer05.Main().show();
		
	}

}
