package lab_09;

public class Answer {
	private String text;
	private boolean correct;
	
	public Answer(String text, boolean correct){
		this.setText(text);
		this.setCorrect(correct);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	public String toString(){
		return this.getText();
	}
	
}
