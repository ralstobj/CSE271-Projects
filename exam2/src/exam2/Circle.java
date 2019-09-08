package exam2;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Drawable {
	
	public Circle(int x, int y, Color color){
		this.setColor(color);
		this.setX(x);
		this.setY(y);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawOval(getX(), getY(), 30, 30);
	}

}
