import java.awt.Color;
import java.awt.Point;
import java.util.Random;

public class Target extends Rectangle {
	public Target(double length, double width, Point location){
		this.setWidth(width);
		this.setLength(length);
		

		Random rand = new Random();
		int r = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		this.setColor(new Color(r,g,b));
		this.setLocation(location);
		
	}
	
}
