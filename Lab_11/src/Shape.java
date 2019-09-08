import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class Shape{
	private double area, perimeter;
	private Point location;
	private Color color;
	
	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}
	
	
	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public abstract void calArea();
	public abstract void calPerimeter();

	@Override
	public String toString() {
		return "Shape [area=" + area + ", perimeter =" + perimeter + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false; 
		
		if(obj.getClass() == this.getClass()) {
			Shape s = (Shape) obj;
			if(this.area == s.area && this.perimeter == s.perimeter)
				return true;
		}
		
		return false;
	}
	
	
	
	
	
	
	
}
