package ejer03_1;

public abstract class GeometricFigure {

	private String color;

    public GeometricFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    @Override
    public String toString() {
        return "Figura Geométrica [Color=" + color + "]";
    }
	
}
