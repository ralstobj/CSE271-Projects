import java.awt.Graphics;

public abstract class Moveable {
	
	int xLocation;
	int yLocation;
	private int direction;
	public abstract void move();
	public abstract void draw(Graphics g);

	
	public int getxLocation() {
		return xLocation;
	}

	public void setxLocation(int xLocation) {
		this.xLocation = xLocation;
	}

	public int getyLocation() {
		return yLocation;
	}

	public void setyLocation(int yLocation) {
		this.yLocation = yLocation;
	}
	
	public int getDirection(){
		return direction;
	}
	
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	
}
