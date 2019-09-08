package lab_09;

import java.util.Scanner;

public abstract class Question {

	public String text;
	public String answer;

	public abstract int checkAnswer(Scanner s);

	public abstract String getQuestion(int index);

	public String toString() {
		return text + "\n" + answer;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	//public abstract void display();

}
