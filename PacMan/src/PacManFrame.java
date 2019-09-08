import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PacManFrame extends JFrame {

	private final int FRAME_WIDTH = 420;
	private final int FRAME_HEIGHT = 500;
	JPanel panel;
	private int[][] board;
	private int totalDots=0;
	private Pac pacMan;
	
	public PacManFrame() throws FileNotFoundException{
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setTitle("Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pacMan = new Pac();
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		Canvas c = new Canvas(FRAME_WIDTH, FRAME_HEIGHT);
		panel.add(c);
		openFile();
		this.add(panel);
		
		this.setVisible(true);
		
	}
	public void openFile() throws FileNotFoundException{
		board = new int[19][19];
		Scanner reader = new Scanner(new File("src/board.txt"));
		for(int i =0; i<19; i++){
			for(int j=0; j<19; j++){
				board[i][j] = reader.nextInt();
				if(board[i][j]== 1){
					totalDots++;
				}
			}
		}
		reader.close();
	}
	
	class Canvas extends JComponent {

		public Canvas(int width, int height) {
			this.setPreferredSize(new Dimension(width, height));
		}

		protected void paintComponent(Graphics g) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, getWidth(), getHeight());
			
			g.setColor(Color.WHITE);
			g.drawRect(17, 17, getWidth() - 36,  getWidth() - 36);
			drawBoard(g);
			
			pacMan.draw(g);
			repaint();
		}
		
		public void drawBoard(Graphics g){
			for(int i =0; i<19; i++){
				for(int j=0; j<19; j++){
					if(board[i][j] == -1){
						g.setColor(Color.BLUE);
						g.fillRect(18 + i*20, 18+ j*20, 20, 20);
					}else if(board[i][j] == 1){
						g.setColor(Color.YELLOW);
						g.fillOval(18+8 + i*20, 18+8+ j*20, 5, 5);
					}
				}
			}
		}
	}
	
	public static void main(String args[]) throws FileNotFoundException{
		PacManFrame f = new PacManFrame();
	}
}
