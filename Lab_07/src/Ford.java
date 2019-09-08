
public class Ford implements Truck {
	private final int axles;
	private int weight;
	
	/**Constructor for the Ford
	 * @param axles Number of axels of the truck
	 * @param weight Weight of the truck
	 */
	public Ford(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	
	}
	/** Method that can set the weight of the truck.
	 * @param weight Weight of the truck.
	 */
	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			this.weight = 0;
		}
	}

	/* (non-Javadoc)
	 * @see Truck#getAxles()
	 */
	@Override
	public int getAxles() {
		return this.axles;
	}

	/* (non-Javadoc)
	 * @see Truck#getWeight()
	 */
	@Override
	public int getWeight() {
		return this.weight;
	}

}
