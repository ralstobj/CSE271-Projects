import java.util.Random;
import java.util.Scanner;

public class ArrayAccess {
	public static void main (String args[]){
		Random r = new Random();
		int[] numbers = new int[10];
		for(int i = 0; i<numbers.length;i++){
			numbers[i]= r.nextInt(10)+1;
		}
		Scanner reader = new Scanner(System.in);
		while(true){
		System.out.println("Enter a number from 0 – 9 or -1 to exit");
		int num = reader.nextInt();
		if(num == -1){
			break;
		}else{
			try{
				
				System.out.print( numbers[num]);
			
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			System.out.println(" ");
		}
		
		}
	}
}
