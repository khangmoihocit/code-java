
public class Circle extends GeometricObject {
	private double radius;
	
	public Circle(String color, String filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
	
}
