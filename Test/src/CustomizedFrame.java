import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CustomizedFrame extends JFrame {

	final int FRAME_WIDTH = 300;
	final int FRAME_HEIGHT = 400;
	JLabel label = new JLabel("Hello");
	public CustomizedFrame() {
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setTitle("Test Frame");
		addCompToFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void addCompToFrame(){
		
		JLabel label2 = new JLabel("World!");
		JButton button = new JButton("Alert");
		
		button.addActionListener(new ButtonActionListener());
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		panel.add(label2);
		this.add(panel);
	}
	class ButtonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
				label.setText("Good Day");
		}
		
	}

}

