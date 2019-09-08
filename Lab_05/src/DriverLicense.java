
public class DriverLicense extends Card {
	private int exp;

	public DriverLicense(String name, int exp) {
		super(name);
		this.setExp(exp);
		
	}
	public DriverLicense(){
		super("");
		this.setExp(0);
	}
	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	public String format(){
		return super.format() + "\n" +   "Expiration Date:" + exp;
	}
	
}
