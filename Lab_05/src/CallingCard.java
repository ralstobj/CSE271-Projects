
public class CallingCard extends Card{
	private int cardNum;
	private int pin;
	
	public CallingCard(String name,int cardNum, int pin) {
		super(name);
		this.setCardNum(cardNum);
		this.setPin(pin);
	}

	public CallingCard() {
		super("");
		this.setCardNum(0);
		this.setPin(0);
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public String format(){
		return super.format() + "\n" + "Card Number: " + cardNum + "\n" + "Pin:         " + pin; 
	}

	
	
	
	
}
