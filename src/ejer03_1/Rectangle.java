package ejer03_1;

public class Rectangle extends GeometricFigure{

	private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rectángulo [Ancho=" + width + ", Altura=" + height + ", Área=" + calculateArea() + "]";
    }
	
}
