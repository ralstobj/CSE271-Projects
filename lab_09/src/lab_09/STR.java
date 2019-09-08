package lab_09;

import java.util.Scanner;

public class STR extends Question {
	
	public STR(String text, String answer){
		this.setText(text);
		this.setAnswer(answer);
	}
	
	@Override
	public int checkAnswer(Scanner s) {
		String answer = s.next();
		if(answer.equals(this.answer)){
			System.out.println("Correct.");
			return 1;
		}else{
			System.out.println("Incorrect.");
			return 0;
		}
		
	}

	@Override
	public String getQuestion(int index) {
		return index + ". " + this.getText();
	}

}
