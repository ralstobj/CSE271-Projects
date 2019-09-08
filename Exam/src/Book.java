//Author ralstobj
public class Book implements Comparable<Book> {

	private String title;
	private double basePrice;

	/**Constructor of a book
	 * @param title
	 * @param basePrice
	 */
	public Book(String title, double basePrice) {
		this.setTitle(title);
		this.setBasePrice(basePrice);
	}
	/**Copy constructor of a book
	 * @param b Book to be copied
	 */
	public Book(Book b){
		this(b.getTitle(), b.getBasePrice());
	}
	
	/**Method that gets the title of the book
	 * @return Title of the book
	 */
	public String getTitle() {
		return title;
	}

	/**Method that sets the title of the book
	 * @param title Title of the book
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**Method that gets the base price of the book
	 * @return base price of a book
	 */
	public double getBasePrice() {
		return basePrice;
	}
	/**Method that clones a book
	 * @param b Book to be cloned
	 * @return new instance of a book
	 */
	public Book clone(Book b){
		return new Book(b);
	}
	/**Method that sets the base price of the book
	 * @param basePrice Base price of the book
	 */
	public void setBasePrice(double basePrice) {
		if (basePrice >= 0) {
			this.basePrice = basePrice;
		} else {
			this.basePrice = 0;

		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o){
		if(o instanceof Book){
			Book b = (Book)o;
			return this.title.equals(b.title);
		}else{
			return false;
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Book b) {
		return this.title.compareTo(b.title);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Book Title: " + title + ", Base Price: " + basePrice ;
		
	}
}
