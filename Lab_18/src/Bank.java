import java.io.Serializable;
import java.util.ArrayList;

public class Bank implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<BankAccount> accounts;
	
	public Bank(){
		accounts = new ArrayList<BankAccount>();
		
	}
	
	public void addAccount(BankAccount ba){
		accounts.add(ba);
	}
	public BankAccount getBankAccount(int i){
		return accounts.get(i);
	}
	public BankAccount findAccount(int accountNum){
		for(int i = 0; i< accounts.size(); i++){
			if(accounts.get(i).getAcctNum() == accountNum){
				return accounts.get(i);
			}
		}
		return null;
		
	}
	public int getSize(){
		return accounts.size();
	}
}
