import java.io.PrintWriter;
import java.util.Scanner;

public class Student {
	private String id;
	private String fname;
	private String lname;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String t1;
	private String t2;
	private String t3;
	private String t4;
	private double finalScore;

	// Uses PrintWriter to write the mailing address of a student to a file.
	// @param pw Where the student is printed to.
	public void save(PrintWriter pw) {
		pw.println(proper(fname + " " + lname));
		pw.println(proper(address));
		pw.println(proper(city + ", " + state + " " + zip));
		pw.println("Phone:" + phonef(phone));
		pw.println("");
	}

	// Uses Scanner to get a students detail information from a file.
	// @param fin Where the student information is pulled from.
	public void load(Scanner fin) {
		String line = fin.nextLine();
		String[] arr = line.split(",");

		id = (arr[0]);
		fname = (arr[1]);
		lname = (arr[2]);
		address = (arr[3]);
		city = (arr[4]);
		state = (arr[5]);
		zip = (arr[6]);
		phone = (arr[7]);
		t1 = (arr[8]);
		t2 = (arr[9]);
		t3 = (arr[10]);
		t4 = (arr[11]);
		calculateFinalScore();
	}

	@Override
	public String toString() {
		return "ID:          " + id + "\n" + "Name:        " + proper(fname + " " + lname) + "\n" + "Address:     "
				+ proper(address) + "\n" + "City:        " + proper(city) + "\n" + "State:       " + state + "\n"
				+ "Zipcode:     " + zip + "\n" + "Phone:       " + phonef(phone) + "\n" + "Final Score: "
				+ Double.toString(finalScore);

	}

	/*
	 * This function returns the proper version of an inputed string. This means
	 * the first letter of every word becomes uppercase and the rest lowercase.
	 * Example: JOSE - Jose
	 */
	public static String proper(String notProper) {
		String proper = "";
		String[] arr = notProper.split(" ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].toLowerCase();
			String fl = arr[i].substring(0, 1);
			fl = fl.toUpperCase();
			proper += fl + arr[i].substring(1, arr[i].length()) + " ";
		}

		return proper;
	}

	// This function returns a formatted string of a phone number that is passed
	// into the function.
	public static String phonef(String phone) {
		String formPhone = "";
		formPhone = "(" + phone.substring(0, 3) + ")" + phone.substring(3, 6) + "-"
				+ phone.substring(6, phone.length());
		return formPhone;
	}
	//Calculates a Students final score based on their four test scores.
	public void calculateFinalScore() {
		finalScore = (Double.parseDouble(t1) + Double.parseDouble(t2) + Double.parseDouble(t3)
					+ Double.parseDouble(t4)) / 4.0;

	}

	public double getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	public String getT3() {
		return t3;
	}

	public void setT3(String t3) {
		this.t3 = t3;
	}

	public String getT4() {
		return t4;
	}

	public void setT4(String t4) {
		this.t4 = t4;
	}

}
