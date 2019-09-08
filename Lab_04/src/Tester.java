import java.util.ArrayList;
import java.util.Collections;

public class Tester {
	public static void main(String args[]){
	ArrayList<Person> arr = new ArrayList<Person>();
	Student s = new Student("Bob Bobson",27,50,110,"Male","Black", "Brown","Computer Science", 3.5,2017);
	Employee e = new Employee("Rex Tillerson", 60, 60,150,"Male","Gray","Brown",100000,"U.S. Government","Secretary of State");
	EmployeeHourlyRate h = new EmployeeHourlyRate("Rick Sanchez",70, 60,150,"Male","Gray","Brown",0,"Mcdonalds", "Janitor", 40, 8.25);
	arr.add(s);
	arr.add(e);
	arr.add(h);
	System.out.println(arr);
	Collections.sort(arr);
	System.out.println(arr);
	
	}
}
