public class TestTollBooth {

	public static void main(String[] args) {

		TollBooth booth = new AlleghenyTollBooth();

		Truck ford = new Ford(5, 12000);

		Truck chevy = new Chevrolet(2, 5000);

		booth.calculateToll(ford);
		booth.displayData();
		booth.calculateToll(chevy);
		booth.displayData();
		booth.receiptOfCollection();
		booth.displayData();

	}

}
