package lab_09;

import java.util.ArrayList;
import java.util.Scanner;

public class MC extends Question {
	ArrayList<Answer> answers = new ArrayList<Answer>();

	public MC(String text, ArrayList<Answer> answers) {
		this.setText(text);
		this.setAnswers(answers);
	}

	@Override
	public int checkAnswer(Scanner s) {
		int answer = s.nextInt();
		
		if(answers.get(answer - 1).isCorrect())
			return 1;
		
		return 0;
	}

	@Override
	public String getQuestion(int index) {
		String answerList= "";
		for(int i=0; i<answers.size();i++){
			answerList = answerList + (i+1) + ". " + answers.get(i).toString() + "\n";
		}
		return index + ". " + this.getText() + "\n" + answerList;
	}

	public ArrayList<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<Answer> answers) {
		this.answers = answers;
	}

}
