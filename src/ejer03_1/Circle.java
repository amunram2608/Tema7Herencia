package ejer03_1;

public class Circle extends GeometricFigure{

	private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Círculo [Radio=" + radius + ", Área=" + calculateArea() + "]";
    }
	
}
