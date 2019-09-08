import java.awt.Color;
import java.awt.Point;

public class Cannon extends Rectangle {
	
	public Cannon(double length, double width, Point location){
		this.setWidth(width);
		this.setLength(length);
		
		this.setColor(Color.BLACK);
		this.setLocation(location);
	}
	
	public void move(){
		
	}
	public void move(int x){
		this.setLocation(new Point(x, (int) this.getLocation().getY()));
	}

}
