
public class Card {
	
	private String name;

	public Card(){
		this.name = "";
	}

	public Card(String n) {
		this.name = n;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name= name;
	}

	public boolean isExpired(){
		return false;
	}

	public String format(){
		return "Card holder: " + name;
	}

}
