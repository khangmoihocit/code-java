package BT_hinh;

public class Circle extends Shape {
	protected double radius;
	

	public Circle(String color, boolean filler, double radius) {
		super(color, filler);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}

	@Override
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}

	@Override
	public String toString() {
		return super.toString()+  "Circle [radius=" + radius + "]";
	}

	
	
}
