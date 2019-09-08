import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class RegistrationFrame extends JFrame {
	
	final int FRAME_WIDTH = 300;
	final int FRAME_HEIGHT = 400;
	JTextField nameText = new JTextField(10);
	JTextField emailText = new JTextField(10);
	JPasswordField pwText = new JPasswordField(10);
	JPasswordField cpwText = new JPasswordField(10);
	JTextField countryText = new JTextField(10);
	JTextField stateText = new JTextField(10);
	JTextField phonenumText = new JTextField(10);
	JButton submit ;
	JButton clear;
	JButton array;
	ArrayList<Person> persons= new ArrayList<Person>();
	public RegistrationFrame(){
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setTitle("Registration Form In Java");
		addCompToFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void addCompToFrame(){
		JPanel total = new JPanel();
		JPanel title = new JPanel();
		JLabel titleLabel = new JLabel("Registration Form in Windows Form:");
		titleLabel.setForeground(Color.BLUE);
		title.add(titleLabel);
		JPanel dataForm = new JPanel();
		dataForm.setLayout(new GridLayout(7,2));
		JLabel name = new JLabel("Name:");
		JLabel email = new JLabel("Email ID:");
		JLabel pw = new JLabel("Create Password:");
		JLabel cpw = new JLabel("Confirm Password:");
		JLabel country = new JLabel("Country:");
		JLabel state = new JLabel("State:");
		JLabel phonenum = new JLabel("Phone No:");
		
		dataForm.add(name);
		dataForm.add(nameText);
		dataForm.add(email);
		dataForm.add(emailText);
		dataForm.add(pw);
		dataForm.add(pwText);
		dataForm.add(cpw);
		dataForm.add(cpwText);
		dataForm.add(country);
		dataForm.add(countryText);
		dataForm.add(state);
		dataForm.add(stateText);
		dataForm.add(phonenum);
		dataForm.add(phonenumText);
		
		
		JPanel input = new JPanel();
		
		submit = new JButton("Submit");
		clear = new JButton("Clear");
		array = new JButton("Print Information");
		
		input.add(submit);
		input.add(clear);
		input.add(array);
		
		submit.addActionListener(new SubmitActionListener());
		clear.addActionListener(new ClearActionListener());
		array.addActionListener(new ArrayActionListener());
		
		total.add(title);
		total.add(dataForm);
		total.add(input);
		this.add(total);
	}
	class SubmitActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
				String pw = pwText.getText();
				String cpw = cpwText.getText();
				if(pw.equals(cpw)){
					persons.add(new Person(nameText.getText(),emailText.getText(),pwText.getText(),
							countryText.getText(),stateText.getText(),phonenumText.getText()));
					JOptionPane.showMessageDialog(submit, "Data saved successfully!");
				
				}
				else
				{
					JOptionPane.showMessageDialog(submit, "Check your password!");
				}
		}
	}
	class ClearActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			nameText.setText("");
			emailText.setText("");
			pwText.setText("");
			cpwText.setText("");
			countryText.setText("");
			stateText.setText("");
			phonenumText.setText("");
			
			JOptionPane.showMessageDialog(clear, "Cleared!");
		}
	}
		class ArrayActionListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(int x = 0; x<persons.size();x++){
					System.out.println(persons.get(x));
				}
			}
			
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
