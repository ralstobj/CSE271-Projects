import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pac extends Moveable {

	public Pac(){
		setxLocation(198);
		setyLocation(298);
		setDirection(2);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	public void setDirection(int directions) {
		
		
	}

	@Override
	public void draw(Graphics g) {
		Image img;
		if (getDirection() == 1) {
		 img = Toolkit.getDefaultToolkit().getImage("img/pacmanup.jpg");
		} else if (getDirection() == 2) {
		 img = Toolkit.getDefaultToolkit().getImage("img/pacmanright.jpg");
		} else if (getDirection() == 3) {
		 img = Toolkit.getDefaultToolkit().getImage("img/pacmandown.jpg");
		} else {
		 img = Toolkit.getDefaultToolkit().getImage("img/pacmanleft.jpg");
		}
		//g.setColor(Color.WHITE);
		//g.fillRect(getxLocation(), getyLocation(), 20, 20);
	
		g.drawImage(img, getxLocation(), getyLocation(), null);
		

	}

}
