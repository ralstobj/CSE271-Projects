//Author ralstobj
public class Novel extends Book {

	private String type;
	private double percentMarkup;

	/** Constructor of the novel
	 * @param title Title of the novel
	 * @param price Price of the novel
	 * @param type	Type of the novel
	 * @param percentMarkup Percent markup of the novel
	 */
	public Novel(String title, double price, String type, double percentMarkup) {
		super(title, price);
		this.setType(type);
		this.setPercentMarkup(percentMarkup);
	}

	/**Method that gets the type of a novel
	 * @return Type of a novel
	 */
	public String getType() {
		return type;
	}

	/**Method that sets the type of a novel
	 * @param type Type of a novel
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**Method that gets the percent markup of a novel
	 * @return Percent markup of a novel
	 */
	public double getPercentMarkup() {
		return percentMarkup;
	}

	/**Method that sets the percent markup of a novel
	 * @param percentMarkup Percent markup of a novel
	 */
	public void setPercentMarkup(double percentMarkup) {
		if (percentMarkup >= 0) {
			this.percentMarkup = percentMarkup;
		} else {
			this.percentMarkup = 0;

		}
	}

	/**Method that returns the total cost of a novel after markup
	 * @return Total cost after markup
	 */
	public double totalCost() {
		return this.getBasePrice() * (1 + (percentMarkup / 100.0));
	}

	/* (non-Javadoc)
	 * @see Book#toString()
	 */
	public String toString() {
		return "Novel Title: " + this.getTitle() + ", Base Price: " + this.getBasePrice() + ", Type: " + type
				+ ", Percent markup: " + percentMarkup;
	}

	/* (non-Javadoc)
	 * @see Book#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		if (o instanceof Novel) {
			Novel b = (Novel) o;
			return this.getTitle().equals(b.getTitle()) && this.type.equals(b.type);
		} else {
			return false;
		}
	}
}
