package exam2;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Drawable {
	private int x,y;
	private Color color;
	public abstract void draw(Graphics g);
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
}
