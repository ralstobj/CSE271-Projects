package lab_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	ArrayList<Question> questions = new ArrayList<Question>();

	public Quiz(File file) throws FileNotFoundException {
		Scanner reader = new Scanner(file);
		while (reader.hasNextLine()) {
			String type = reader.nextLine();
			if (type.equals("N") || type.equals("S") || type.equals("T")) {
				String text = reader.nextLine();
				String ans = reader.nextLine();
				questions.add(new NR(text, ans));
			} else if (type.equals("M")) {
				String text = reader.nextLine();
				ArrayList<Answer> answers = new ArrayList<Answer>();
				while (!reader.nextLine().trim().isEmpty()) {
					String correct = reader.next();
					String ans = reader.next();
					System.out.println("****" + correct);
					if (correct.equals("+")) {
						answers.add(new Answer(ans, true));
					} else {	
						answers.add(new Answer(ans, false));
					}
				}
				questions.add(new MC(text, answers));
			}
		}
		reader.close();

	}
	public String toString(){
		String questio = "";
		for(int i=0; i<questions.size();i++){
			questio += questions.get(i).getQuestion(i+1) + "\n";
		}
		return questio;
	}
}
