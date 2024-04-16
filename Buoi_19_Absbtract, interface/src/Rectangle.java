
public class Rectangle extends GeometricObject {
	private double width, length;
	
	public Rectangle(String color, String filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	@Override
	public double getArea() {
		return width * length;
	}
	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}
	
}
