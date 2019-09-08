
public class Tester {
	public static void main(String args[]) {
		Card id = new IDCard("Bob", 0123456);
		Card cc = new CallingCard("Mike", 513213534, 132456);

		Billfold b = new Billfold();
		b.addCard(id);
		b.addCard(cc);
		System.out.println(b.formatCards());
	}
}
