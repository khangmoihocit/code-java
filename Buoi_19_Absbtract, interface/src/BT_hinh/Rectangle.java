package BT_hinh;

public class Rectangle extends Shape{
	protected int width, length;

	public Rectangle(String color, boolean filler, int width, int length) {
		super(color, filler);
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
