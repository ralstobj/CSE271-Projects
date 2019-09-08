package exam2;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Drawable {
	public Rectangle(int x, int y, Color color){
		this.setColor(color);
		this.setX(x);
		this.setY(y);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawRect(getX(), getY(), 30, 30);
	}
}
