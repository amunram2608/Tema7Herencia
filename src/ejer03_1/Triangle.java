package ejer03_1;

public class Triangle extends GeometricFigure{

	private double base;
    private double height;

    // Constructor
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Triángulo [Base=" + base + ", Altura=" + height + ", Área=" + calculateArea() + "]";
    }
	
}
