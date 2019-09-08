import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutput {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		File f;
		Scanner fileScanner;
		while(true){
			System.out.println("Enter file name:");
			try{
				String fileName = s.next();
				f = new File(fileName);
				 fileScanner = new Scanner(f);
				break;
			}catch(FileNotFoundException e){
				System.out.println("File not Found");
			}
		}
		s.close();
		int sum = 0;
		while(fileScanner.hasNext()){
			try{
				String n = fileScanner.next();
				sum += Integer.parseInt(n);
			}catch(NumberFormatException e){
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println(sum);
	}
}
