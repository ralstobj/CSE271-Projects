//Author ralstobj and zhaog2
public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = c1.clone();
		Car c3 = new Car("Mazda","CX-5",2017,"Bailey",31,25);
		Car c4 = new Car(c3);
		System.out.println(c1);
		c1.drive(20);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("Is c2 equal to c3? " + c2.equals(c3));
		System.out.println(c3);
		System.out.println(c4);

	}

}
