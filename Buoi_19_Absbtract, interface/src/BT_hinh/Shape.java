package BT_hinh;

public abstract class Shape {
	private String color;
	private boolean filler;
	public Shape(String color, boolean filler) {
		this.color = color;
		this.filler = filler;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + ", filler=" + filler + "]";
	}
	public boolean isFiller() {
		return filler;
	}
	public void setFiller(boolean filler) {
		this.filler = filler;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
