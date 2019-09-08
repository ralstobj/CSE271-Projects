
//Author ralstobj
import java.util.ArrayList;

public class BookTester {
	public static void main(String args[]) {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("Dummy-Book", 20));
		books.add(new Novel("Guns-Of-Navarone", 50, "Adventure", 10));
		books.add(new Novel("Guns-Of-Navarone", 45, "Adventure", 15));
		books.add(new Novel("Icarus-Agenda", 35.75, "Mystery", 7));
		books.add(new Novel("Love-Story", 25.50, "Romance", 8));
		books.add(new Textbook("Intro-To-Programming", 75.0, "Comp-Sci", 10));
		books.add(new Textbook("Elements-Of-Calculus", 56.00, "Mathematics", 15));
		System.out.println(books.get(1).equals(books.get(2)));
		System.out.println(books.get(3).equals(books.get(4)));
		System.out.println(books.get(5).equals(books.get(6)));
		((Novel) books.get(1)).setPercentMarkup(20);
		System.out.println(((Novel) books.get(1)).totalCost());
		((Textbook) books.get(5)).setPercentageDiscount(20);
		System.out.println(((Textbook) books.get(5)).totalCost());
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
	}

}
