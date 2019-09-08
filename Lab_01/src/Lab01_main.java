// Author ralstobj and zhaog2
/* Program that can read a list of personal information from a text file,
 * search that information, and write the personal information to a file.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab01_main {

public static void main(String args[]) throws FileNotFoundException{
	ArrayList<String> id = new ArrayList<String>();
	ArrayList<String> fname = new ArrayList<String>();
	ArrayList<String> lname = new ArrayList<String>();
	ArrayList<String> address = new ArrayList<String>();
	ArrayList<String> city = new ArrayList<String>();
	ArrayList<String> state = new ArrayList<String>();
	ArrayList<String> zipcode = new ArrayList<String>();
	ArrayList<String> phonenum = new ArrayList<String>();
	ArrayList<String> T1 = new ArrayList<String>();
	ArrayList<String> T2 = new ArrayList<String>();
	ArrayList<String> T3 = new ArrayList<String>();
	ArrayList<String> T4 = new ArrayList<String>();
	read(id,fname,lname,address,city,state,zipcode,phonenum,T1,T2,T3,T4);
	Scanner reader = new Scanner(System.in);
	System.out.println("Welcome to the information database. What would you like to do?");
	System.out.println("Find a record (Type F)");
	System.out.println("Write mailing labels to file (Type W)");
	System.out.println("Find the failing students (Type T)");
	System.out.println("Exit (Type E)");
	System.out.println("");
	String answer = reader.next();
	do{
	
		if(answer.equalsIgnoreCase("F")){
			System.out.println("Enter the first and last name of the person you are searching for");
			String name = reader.next();
			name += " " + reader.next();
			find(id,fname,lname,address,city,state,zipcode,phonenum,name);
			System.out.println("");
		}else if(answer.equalsIgnoreCase("W")){
			write(id,fname,lname,address,city,state,zipcode,phonenum);
			System.out.println("Mailing List successfully printed see src folder to find it.");
			System.out.println("");
		}else if(answer.equalsIgnoreCase("T")){
			findLow(id,fname,lname,address,city,state,zipcode,phonenum,T1,T2,T3,T4);
			System.out.println("List was successfully printed see src folder to find it.");
			System.out.println("");
		}
		System.out.println("Welcome to the information database. What would you like to do?");
		System.out.println("Find a record (Type F)");
		System.out.println("Write mailing labels to file (Type W)");
		System.out.println("Find the failing students (Type T)");
		System.out.println("Exit (Type E)");
		System.out.println("");
		answer = reader.next();
	}while(!answer.equalsIgnoreCase("E"));
	
	
}
/* This function returns the proper version of an inputed string.
 * This means the first letter of every word becomes uppercase and the rest lowercase.
 * Example: JOSE - Jose
 */
public static String proper(String notProper){
	String proper= "";
	String[] arr = notProper.split(" ");
	for(int i = 0; i<arr.length; i ++){
		arr[i] = arr[i].toLowerCase();
		String fl = arr[i].substring(0,1);
		fl = fl.toUpperCase();
		proper += fl + arr[i].substring(1,arr[i].length()) + " ";
	}
	
	return proper;
}
/*This method reads the information data from the file.
 * Then it breaks it up into pieces to store in multiple Arraylists.
 */
public static void read(ArrayList<String> id,ArrayList<String>fname,ArrayList<String>lname,ArrayList<String>address,ArrayList<String>city,ArrayList<String>state,ArrayList<String>zipcode,ArrayList<String>phonenum,ArrayList<String> T1,ArrayList<String> T2,ArrayList<String> T3,ArrayList<String> T4) throws FileNotFoundException{
	File data = new File("src/lab01_data_new.csv");
	Scanner reader = new Scanner(data);
	
	while(reader.hasNext()){
		String line = reader.nextLine();
		String[] arr = line.split(",");
		
		id.add(arr[0]);
		fname.add(arr[1]);
		lname.add(arr[2]);
		address.add(arr[3]);
		city.add(arr[4]);
		state.add(arr[5]);
		zipcode.add(arr[6]);
		phonenum.add(arr[7]);
		T1.add(arr[8]);
		T2.add(arr[9]);
		T3.add(arr[10]);
		T4.add(arr[11]);
	}
	reader.close();
	
}
// This method returns the average of the exam score for a selected student.
public static double average(ArrayList<String> T1, ArrayList<String> T2,ArrayList<String> T3,ArrayList<String> T4, int i){
	return (Double.parseDouble(T1.get(i))+Double.parseDouble(T2.get(i))+Double.parseDouble(T3.get(i))+Double.parseDouble(T4.get(i)))/4.0;
}
//This method uses the average method to find the students that have an average score less than 50 and saves them to a textfile.
public static void findLow(ArrayList<String> id,ArrayList<String>fname,ArrayList<String>lname,ArrayList<String>address,ArrayList<String>city,ArrayList<String>state,ArrayList<String>zipcode,ArrayList<String>phonenum,ArrayList<String> T1,ArrayList<String> T2,ArrayList<String> T3,ArrayList<String> T4) throws FileNotFoundException{
PrintWriter writer = new PrintWriter(new File("src/lowScore.txt"));
	
	for(int i = 1; i<fname.size(); i++){
	double score = average(T1,T2,T3,T4,i);
	if(score < 50){
		writer.println("ID:   " + id.get(i));
		writer.println("Name: " +proper(fname.get(i) + " " + lname.get(i)).trim());
		writer.println("");
	}
	}
	
	writer.close();
}
/* This method passes in a search field that searches the array for a specific name.
 * If a name is found it prints out the information that goes along with that name.
 * If the name is not found then it shows as not found.
 */
public static void find(ArrayList<String> id,ArrayList<String>fname,ArrayList<String>lname,ArrayList<String>address,ArrayList<String>city,ArrayList<String>state,ArrayList<String>zipcode,ArrayList<String>phonenum, String name){
	
	int index = -1;
	
	for(int i = 1; i< fname.size(); i++){
		String test = fname.get(i) + " " + lname.get(i);
		if(name.compareToIgnoreCase(test)==0){
			index= i;
		}
	}
	print(id,fname,lname,address,city,state,zipcode,phonenum,index);
}
// This function returns a formatted string of a phone number that is passed into the function.
public static String phonef(String phone){
	String formPhone = "";
	formPhone = "("+ phone.substring(0,3)+")" + phone.substring(3,6) + "-" + phone.substring(6, phone.length());
	return formPhone;
}
//This method uses System.out.println() to print out a specific index from the information gathered from the file.
public static void print(ArrayList<String> id,ArrayList<String>fname,ArrayList<String>lname,ArrayList<String>address,ArrayList<String>city,ArrayList<String>state,ArrayList<String>zipcode,ArrayList<String>phonenum,int index){
	if(index == -1){
		System.out.println("Not found");
	}else{
		System.out.println("ID:      " + id.get(index));
		System.out.println("Name:    "+proper(fname.get(index) + " " + lname.get(index)));
		System.out.println("Address: "+ proper(address.get(index).trim()));
		System.out.println("City:    " + proper(city.get(index).trim()));
		System.out.println("State:   " +state.get(index));
		System.out.println("Zipcode: " + zipcode.get(index));
		System.out.println("Phone:   " + phonef(phonenum.get(index)));
	}
}
//This method writes every piece of information about a person in the form of a mailing address to a file.
public static void write(ArrayList<String> id,ArrayList<String>fname,ArrayList<String>lname,ArrayList<String>address,ArrayList<String>city,ArrayList<String>state,ArrayList<String>zipcode,ArrayList<String>phonenum) throws FileNotFoundException{
	PrintWriter writer = new PrintWriter(new File("src/mailList.txt"));
	
	for(int i = 1; i<fname.size(); i++){
	writer.println(proper(fname.get(i) + " " + lname.get(i)).trim());
	writer.println(proper(address.get(i)).trim());
	writer.println(proper(city.get(i)).trim()+", " + state.get(i)+ " " + zipcode.get(i));
	writer.println("Phone:" + phonef(phonenum.get(i)));
	writer.println("");
	}
	
	writer.close();
}
}
