package lab_09;

import java.util.Scanner;

public class NR extends STR {
	
	
	public NR(String text, String answer){
		super(text,answer);
	}
	
	@Override
	public int checkAnswer(Scanner s) {
		double answer = s.nextDouble();
		if(answer==Double.parseDouble(this.answer)){
			System.out.println("Correct.");
			return 1;
		}else{
			System.out.println("Incorrect.");
			return 0;
		}
		
	}

}
