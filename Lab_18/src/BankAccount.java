import java.io.Serializable;

public class BankAccount implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ownerName;
	private int acctNum;
	private double balance;
	static int numOfAccounts = 0;
	
	public BankAccount(String owner, double bal){
		this.ownerName = owner;
		numOfAccounts ++;
		this.acctNum = numOfAccounts;
		this.balance = bal;
		
	}
	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double money){
		this.balance +=money;
	}
	public void withdraw(double money){
		this.balance -=money;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "BankAccount [ownerName=" + ownerName + ", acctNum=" + acctNum + ", balance=$" + balance + "]";
	}
	
	
	
}
