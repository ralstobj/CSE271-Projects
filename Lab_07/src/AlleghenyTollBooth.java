import java.util.ArrayList;

public class AlleghenyTollBooth implements TollBooth {
	
	//private int totalTrucks;
	//private int totalReceipts;
	private ArrayList<Truck> trucks = new ArrayList<Truck>();
	
	/* (non-Javadoc)
	 * @see TollBooth#calculateToll(Truck)
	 */
	@Override
	public void calculateToll(Truck t) {
		trucks.add(t);
		int total = t.getAxles()*5;
		total += t.getWeight()/100;
		//totalTrucks++;
		//totalReceipts += total;
		System.out.println("Truck arrival - Axles: " + t.getAxles() + " Total weight: " + t.getWeight() + " Toll due: $" + total);
	}

	/* (non-Javadoc)
	 * @see TollBooth#displayData()
	 */
	@Override
	public void displayData() {
		int totalCost = 0;
		for(int i = 0; i< trucks.size(); i++){
			totalCost = trucks.get(i).getAxles()*5;
			totalCost += trucks.get(i).getWeight()/100;
		}
		System.out.println("Totals since the last collection - Receipts:  $"
	+ totalCost + " Trucks: " + trucks.size() );
	}

	/* (non-Javadoc)
	 * @see TollBooth#receiptOfCollection()
	 */
	@Override
	public void receiptOfCollection() {
		System.out.println("*** Collecting receipts ***");
		displayData();
		trucks.clear();
		//totalTrucks = 0;
		//totalReceipts = 0;
	}

}
