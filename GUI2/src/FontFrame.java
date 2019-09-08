import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class FontFrame extends JFrame {
	
	private final int FRAME_HEIGHT = 400;
	private final int FRAME_WIDTH = 400;
	JPanel radioButtons = new JPanel();
	JPanel checkBoxPanel = new JPanel();
	JPanel comboPanel = new JPanel();
	JRadioButton small;
	JRadioButton medium;
	JCheckBox italic;
	JCheckBox bold;
	JRadioButton large;
	JComboBox<String> fonts;
	JLabel label;
	
	public FontFrame(){
		this.setTitle("Hello");
		this.setMinimumSize(new Dimension(FRAME_HEIGHT,FRAME_WIDTH));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		
		label = new JLabel("JAVA");
		label.setFont(new Font("Serif", label.getFont().getStyle(),label.getFont().getSize()));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setPreferredSize(new Dimension(FRAME_HEIGHT,FRAME_WIDTH/2));
		addJButtons();
		addJCheckBox();
		addComboBox();
		panel.add(label);
		panel.add(comboPanel);
		panel.add(checkBoxPanel);
		panel.add(radioButtons);
		this.add(panel);
		this.setVisible(true);
	}
	public void addJCheckBox(){
		italic = new JCheckBox("Italic");
		italic.addActionListener(new CheckBoxActionListener());
		bold = new JCheckBox("Bold");
		bold.addActionListener(new CheckBoxActionListener());
		checkBoxPanel.add(italic);
		checkBoxPanel.add(bold);
		checkBoxPanel.setBorder(new TitledBorder(new EtchedBorder(),"Style"));
	}
	public void addComboBox(){
		fonts = new JComboBox<String>();
		fonts.addItem("Serif");
		fonts.addItem("SansSerif");
		fonts.addActionListener(new ComboActionListener());
		comboPanel.add(fonts);
		comboPanel.setBorder(new TitledBorder(new EtchedBorder(),"Font"));
	}
	public void addJButtons(){
		small = new JRadioButton("Small");
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");
		ButtonGroup group = new ButtonGroup();
		group.add(small);
		group.add(medium);
		group.add(large);
		small.addActionListener(new RadioActionListener());
		medium.addActionListener(new RadioActionListener());
		large.addActionListener(new RadioActionListener());
		radioButtons.add(small);
		radioButtons.add(medium);
		radioButtons.add(large);
		radioButtons.setBorder(new TitledBorder(new EtchedBorder(), "Size"));
	}
	
	public static void main(String args[]){
		FontFrame f = new FontFrame();
	}
	
	class RadioActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(small.isSelected()){
				label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle(),10));
			}else if(medium.isSelected()){
				label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle(),30));
			}else{
				label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle(),50));
			}
			System.out.println("Rado" + label.getFont().getStyle());
		}
		
	}
	class CheckBoxActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(italic.isSelected()&&bold.isSelected()){
				label.setFont(new Font(label.getFont().getName(),Font.BOLD + Font.ITALIC,label.getFont().getSize()));
			}else if(bold.isSelected()){
				label.setFont(new Font(label.getFont().getName(),Font.BOLD,label.getFont().getSize()));
			}else if(italic.isSelected()){
				label.setFont(new Font(label.getFont().getName(),Font.ITALIC,label.getFont().getSize()));
			}else{
				label.setFont(new Font(label.getFont().getName(),Font.PLAIN,label.getFont().getSize()));
			}
		
		}
		
	}
	class ComboActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
				label.setFont(new Font(fonts.getSelectedItem().toString(),label.getFont().getStyle(),label.getFont().getSize()));
		
		}
		
	}
}
