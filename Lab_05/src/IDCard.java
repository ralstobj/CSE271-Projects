
public class IDCard extends Card {
	private int idNum;

	public IDCard(){
		super("");
		this.setIdNum(0);
	}
	public IDCard(String name, int num){
		super(name);
		this.setIdNum(num);
	}
	
	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public String format(){
		return super.format() + "\n" + "ID Number:   " + idNum;
	}

}
