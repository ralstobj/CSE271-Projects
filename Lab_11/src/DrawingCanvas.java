import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DrawingCanvas extends JFrame {

	private final int FRAME_WIDTH = 400;
	private final int FRAME_HEIGHT = 400;
	private JPanel panel;
	private Color color = Color.BLACK;
	private Cannon cannon = new Cannon(20,10,new Point(200,335));
	ArrayList<Missile> missiles = new ArrayList<Missile>();
	ArrayList<Target> targets = new ArrayList<Target>();
	

	public DrawingCanvas() {
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setTitle("Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Random rand = new Random();
		for(int i = 0; i<20; i++){
			int y = rand.nextInt(100);
			int x = rand.nextInt(401);
			targets.add(new Target(20,30, new Point(x,y)));
		}
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		Canvas c = new Canvas(FRAME_WIDTH, FRAME_HEIGHT);
		panel.add(c);
		Timer tmr = new Timer(20, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(Drawable d:missiles){
					d.move();
				}
				for(int i = 0; i<targets.size(); i++){
					targets.get(i).move();
					for(int j= 0; j<missiles.size(); j++){
						if(targets.get(i).intersects(missiles.get(j))){
							
						}
					}
				
				}
				repaint();

			}
		}); 
		tmr.start();
		panel.addMouseMotionListener(new MouseMotionListener(){
			@Override
		
		public void mouseMoved(MouseEvent e) {
			cannon.move(e.getX());
			repaint();

		}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		panel.setFocusable(true);
		panel.addKeyListener((new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {


			}

			@Override
			public void keyPressed(KeyEvent e) {
				missiles.add(new Missile(10,10,new Point(cannon.getLocation())));
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

		}));
		this.add(panel);
		this.setVisible(true);
		//missile.add(new Rectangle(10,10,new Point(50,50), Color.YELLOW));
	}

	class Canvas extends JComponent {

		public Canvas(int width, int height) {
			this.setPreferredSize(new Dimension(width, height));
		}

		protected void paintComponent(Graphics g) {
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, getWidth(), getHeight());
			for(Missile d:missiles){
				d.draw(g);
				if(!d.inBorder()){
					missiles.remove(d);
				}
			}
			for(Target t:targets){
				t.draw(g);
			}
			cannon.draw(g);

		}
	}
	public static void main(String args[]){
		DrawingCanvas d = new DrawingCanvas();
	}
}
