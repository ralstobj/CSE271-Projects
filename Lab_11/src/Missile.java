import java.awt.Color;
import java.awt.Point;

public class Missile extends Rectangle {

	public Missile(double length, double width, Point location){
		this.setWidth(width);
		this.setLength(length);
		
		this.setColor(Color.GRAY);
		this.setLocation(location);
	}
	public void move() {
		
		this.getLocation().translate(0,-5);
		
	}
	public boolean inBorder(){
		 return this.getLocation().getX()>0;
		}
}
