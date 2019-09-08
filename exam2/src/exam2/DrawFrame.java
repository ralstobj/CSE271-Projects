package exam2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DrawFrame extends JFrame {

	private Color currentColor = Color.BLUE;
	private ArrayList<Drawable> drawables = new ArrayList<Drawable>();

	private final int FRAME_WIDTH = 400;
	private final int FRAME_HEIGHT = 400;
	private JPanel mainPanel;
	private JPanel canvasPanel;
	private JPanel checkBoxesPanel;
	private JPanel radioButPanel;
	private JRadioButton r;
	private JRadioButton g;
	private JRadioButton b;
	private JCheckBox rect;
	private JCheckBox circle;
	private JCheckBox line;

	public DrawFrame() {

		this.setTitle("Draw Shapes");
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUpPanels();
		this.setVisible(true);
	}

	public void setUpPanels() {

		mainPanel = new JPanel();
		mainPanel.setSize(FRAME_WIDTH, FRAME_HEIGHT);

		Canvas canvas = new Canvas();
		canvasPanel = new JPanel();
		canvasPanel.setSize(400, 300);
		canvasPanel.add(canvas);
		mainPanel.add(canvasPanel);

		checkBoxesPanel = new JPanel();
		checkBoxesPanel.setSize(400, 30);
		setUpCheck();
		mainPanel.add(checkBoxesPanel);

		radioButPanel = new JPanel();
		radioButPanel.setSize(400, 30);
		setUpRad();
		b.setSelected(true);
		mainPanel.add(radioButPanel);

		this.add(mainPanel);
	}

	public void setUpCheck() {
		rect = new JCheckBox("Rectangle");
		circle = new JCheckBox("Circle");
		line = new JCheckBox("Line");

		checkBoxesPanel.add(rect);
		checkBoxesPanel.add(circle);
		checkBoxesPanel.add(line);
	}

	public void setUpRad() {
		
		r = new JRadioButton("Red");
		r.addActionListener(new RadActionListenter());

		g = new JRadioButton("Green");
		g.addActionListener(new RadActionListenter());

		b = new JRadioButton("Blue");
		b.addActionListener(new RadActionListenter());

		ButtonGroup group = new ButtonGroup();
		group.add(r);
		group.add(g);
		group.add(b);

		radioButPanel.add(r);
		radioButPanel.add(g);
		radioButPanel.add(b);
	}

	class Canvas extends JComponent {
		
		public Canvas() {
			
			this.setPreferredSize(new Dimension(400, 300));
			this.setFocusable(true);
			this.addMouseListener(new CanvasListener());
		}

		public void paintComponent(Graphics g) {
		
			if (!drawables.isEmpty()) {
				for (Drawable d : drawables) {
					d.draw(g);
				}
			}
		}
	}

	class RadActionListenter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (r.isSelected()) {
				currentColor = Color.RED;
			}
			if (g.isSelected()) {
				currentColor = Color.GREEN;
			}
			if (b.isSelected()) {
				currentColor = Color.BLUE;
			}

		}

	}

	class CanvasListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			if (circle.isSelected()) {
				drawables.add(new Circle(e.getX(), e.getY(), currentColor));
			}
			if (line.isSelected()) {
				drawables.add(new Line(e.getX(), e.getY(), currentColor));
			}
			if (rect.isSelected()) {
				drawables.add(new Rectangle(e.getX(), e.getY(), currentColor));
			}
			repaint();

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String args[]) {
		DrawFrame d = new DrawFrame();
	}
}
