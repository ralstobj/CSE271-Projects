import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	static ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String args[]) throws FileNotFoundException {
		loadStudents();
		areaCodeLookUp("19121");
		failedStudentsLookup();
	}

	public static void loadStudents() throws FileNotFoundException {
		File data = new File("src/lab01_data_new.csv");
		Scanner reader = new Scanner(data);
		reader.nextLine();
		while (reader.hasNext()) {
			Student s = new Student();
			s.load(reader);
			students.add(s);
		}
		reader.close();
	}

	public static String areaCodeLookUp(String areaCode) {
		int index = -1;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getZip().compareToIgnoreCase(areaCode) == 0) {
				index = i;
				System.out.println(students.get(i).toString());
			}
		}
		if (index != -1) {
			return students.get(index).toString();
		} else {
			return "Not Found";
		}
	}

	public static void failedStudentsLookup() throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(new File("src/failedStudents.txt"));

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getFinalScore() < 50) {
				students.get(i).save(writer);
			}
		}

		writer.close();
	}
}
