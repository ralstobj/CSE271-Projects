import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Caesar {
	static int key;
	
	public static void main(String args[]) throws IOException{
		key = 200;
		//encrypt("testFile", "returnFile");
		decrypt("returnFile", "testFile");
	}
	public static void encrypt(String fileInputName, String fileOutputName) throws IOException{
		FileOutputStream os = new FileOutputStream(new File(fileOutputName));
		FileInputStream is = new FileInputStream(new File(fileInputName));
		int val = is.read();
		while(val != -1){
			int newVal = (val + key)%256;
			os.write(newVal);
			val = is.read();
		}
		is.close();
		os.close();
		
	}
	public static void decrypt(String fileInputName, String fileOutputName) throws IOException{
		FileOutputStream os = new FileOutputStream(new File(fileOutputName));
		FileInputStream is = new FileInputStream(new File(fileInputName));
		int val = is.read();
		while(val != -1){
			
			int newVal = (val-key);
			os.write(newVal);
			val = is.read();
		}
		is.close();
		os.close();
	}
	
}
