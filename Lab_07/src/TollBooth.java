
public interface TollBooth {

	/** Calculates the toll of the a truck that passes through and adds the truck to a running total.
	 * @param t The truck passing through the toll booth.
	 */
	public void calculateToll(Truck t);

	/**
	 * Displays the total number of trucks that have gone through toll booth and how much money the booth has made.
	 */
	public void displayData();

	/**
	 * Displays the current total of the toll booth and then resets the toll booth.
	 */
	public void receiptOfCollection();

}
