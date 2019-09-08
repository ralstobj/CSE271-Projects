package lab_09;

import java.io.File;
import java.io.FileNotFoundException;

public class Tester {
	public static void main (String args[]) throws FileNotFoundException{
		Quiz quiz = new Quiz(new File("src/lab_09/test.txt"));
		System.out.println(quiz.toString());
		
	}
}
