//Author ralstobj
public class Textbook extends Book {
	
	public String field;
	public double percentageDiscount;
	
	/**Constructor for a textbook
	 * @param title Title of Textbook
	 * @param basePrice Base Price of Textbook
	 * @param field Field of Textbook
	 * @param discount Percentage discount on Textbook
	 */
	public Textbook(String title, double basePrice, String field, double discount) {
		super(title, basePrice);
		this.setField(field);
		this.setPercentageDiscount(discount);
		
	}
	
	/**Method that gets the field of a textbook
	 * @return Field of a textbook
	 */
	public String getField() {
		return field;
	}
	/**Method that sets the field of a textbook
	 * @param field Field of a textbook
	 */
	public void setField(String field) {
		this.field = field;
	}
	/**Method that gets the percentage discount of a textbook
	 * @return The percentage discount of a textbook
	 */
	public double getPercentageDiscount() {
		return percentageDiscount;
	}
	/**Method that sets the percentage discount of a textbook
	 * @param percentageDiscount The percentage discount of a textbook
	 */
	public void setPercentageDiscount(double percentageDiscount) {
		if (percentageDiscount >= 0) {
			this.percentageDiscount = percentageDiscount;
		} else {
			this.percentageDiscount = 0;

		}
	}
	
	/**Method that returns the total cost of a textbook after the discount
	 * @return Total cost after discount
	 */
	public double totalCost(){
		return this.getBasePrice()*(1-(this.percentageDiscount/100.0));
	}
	
	/* (non-Javadoc)
	 * @see Book#toString()
	 */
	public String toString(){
		return "Textbook Title: " + this.getTitle() + ", Base Price: " + this.getBasePrice() +
				", Field: " + field + ", Discount: " + percentageDiscount;
	}
	/* (non-Javadoc)
	 * @see Book#equals(java.lang.Object)
	 */
	public boolean equals(Object o){
		if(o instanceof Textbook){
			Textbook b = (Textbook)o;
			return this.getTitle().equals(b.getTitle()) && this.field.equals(b.field);
		}else{
			return false;
		}
	}
}
