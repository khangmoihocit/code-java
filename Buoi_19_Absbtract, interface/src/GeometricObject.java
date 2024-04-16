
public abstract class GeometricObject {
	protected String color, filled;
	
	public GeometricObject(String color, String filled) {
		this.color = color;
		this.filled = filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
