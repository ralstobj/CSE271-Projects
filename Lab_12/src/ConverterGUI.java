import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConverterGUI extends JFrame{
	private final int FRAME_HEIGHT = 400;
	private final int FRAME_WIDTH = 400;
	JPanel converterPanel = new JPanel();
	JComboBox<String> from;
	JComboBox<String> to;
	JLabel label;
	JLabel warning = new JLabel("Pick Different Currencies");
	double converted;
	JButton convert;
	JTextField textField;
	public ConverterGUI(){
		this.setTitle("Currency Converter");
		this.setMinimumSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		setUpPanel();
		warning.setForeground(Color.RED);
		warning.setHorizontalAlignment(SwingConstants.CENTER);
		warning.setVisible(false);
		panel.add(warning, BorderLayout.NORTH);
		panel.add(converterPanel, BorderLayout.CENTER);
		convert = new JButton("Convert");
		convert.addActionListener(new ButtonListener());
		panel.add(convert, BorderLayout.SOUTH);
		this.add(panel);
		this.setVisible(true);
		
	}
	public void setUpPanel(){
		converterPanel.setLayout(new GridLayout(2,2));
		from = new JComboBox<String>();
		from.addItem("GBP");
		from.addItem("USD");
		from.addItem("EUR");
		
		to = new JComboBox<String>();
		to.addItem("GBP");
		to.addItem("USD");
		to.addItem("EUR");
		from.addActionListener(new ComboActionListener());
		to.addActionListener(new ComboActionListener());
		label = new JLabel();
		textField = new JTextField();
		converterPanel.add(textField);
		converterPanel.add(label);
		converterPanel.add(from);
		converterPanel.add(to);
		
	}
	public static void main(String args[]){
		ConverterGUI c = new ConverterGUI();
		
	}
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String pattern = "###,###.##";
			DecimalFormat decimalFormat = new DecimalFormat(pattern);
			double initalConversion;
			int test = -1;
			if(!textField.getText().isEmpty()){
			if(to.getSelectedItem().toString().equals(from.getSelectedItem().toString())){
				warning.setVisible(true);
			}else if(from.getSelectedItem().toString().equals("GBP") && to.getSelectedItem().toString().equals("USD")){
				initalConversion= Double.parseDouble(textField.getText());
				converted = initalConversion*1.64;
				test = 0;
			}else if(from.getSelectedItem().toString().equals("GBP") && to.getSelectedItem().toString().equals("EUR")){
				initalConversion= Double.parseDouble(textField.getText());
				converted = initalConversion*1.13;
				test = 0;
			}else if(from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("GBP")){
				initalConversion= Double.parseDouble(textField.getText());
				converted = initalConversion*(1.0/1.64);
				test = 0;
			}else if(from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EUR")){
				initalConversion= Double.parseDouble(textField.getText());
				converted = initalConversion*(1.0/1.42);
				test = 0;
			}else if(from.getSelectedItem().toString().equals("EUR") && to.getSelectedItem().toString().equals("USD")){
				initalConversion= Double.parseDouble(textField.getText());
				converted = initalConversion*1.42;
				test = 0;
			}else if(from.getSelectedItem().toString().equals("EUR") && to.getSelectedItem().toString().equals("GBP")){
				initalConversion= Double.parseDouble(textField.getText());
				converted = initalConversion*(1.0/1.13);
				test = 0;
			}
			if(test !=-1){
				label.setText("$" + decimalFormat.format(converted));
			}
			}
		}
		
	}
	class ComboActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(!to.getSelectedItem().toString().equals(from.getSelectedItem().toString())){
				warning.setVisible(false);
			}
			
		}
		
	}
}
