package exam2;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Drawable {
	
	public Line(int x, int y, Color color){
		this.setColor(color);
		this.setX(x);
		this.setY(y);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawLine(getX(), getY(), getX()+30, getY()+30);
	}

}
