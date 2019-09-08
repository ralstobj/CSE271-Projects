//Authored by ralstobj and zhaog2
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class BankTester {

	public final static int RECORD_SIZE = 32;
	static RandomAccessFile file;

	public static void main(String args[]) throws IOException {
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("Enter filename");
			try {
				String filename = s.next();
				openFile(filename);
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File not found try again");
			}
		}
		while (true) {

			System.out.println("What would you like to do?");
			System.out.println("Add account(a)");
			System.out.println("Find account(f)");
			System.out.println("Find account by owner(o)");
			System.out.println("Make a deposit(d)");
			System.out.println("Exit program(e)");
			String response = s.next();
			if (response.equalsIgnoreCase("e")) {
				closeFile();
				break;
			} else if (response.equalsIgnoreCase("a")) {
				System.out.println("Enter Owner Name");
				String owner = s.next();
				System.out.println("Enter acct number");
				int acctNum = s.nextInt();
				System.out.println("Enter Balance");
				double balance = s.nextDouble();
				write(size() + 1, owner, acctNum, balance);
			} else if (response.equalsIgnoreCase("d")) {
				System.out.println("Enter acct number");
				int acctNum = s.nextInt();
				int val = findAcct(acctNum);
				if (val != -1) {
					System.out.println("Enter Owner Name");
					String owner = s.next();
					System.out.println("Enter Deposit Amount");
					double deposit = s.nextDouble();
					if (deposit > 0) {
						BankAccount b = read(val);
						double newMoney = b.getBalance() + deposit;
						write(val,owner, acctNum, newMoney);
					}

				} else {
					System.out.println("Acct not Found");
				}
			} else if (response.equalsIgnoreCase("f")) {
				System.out.println("Enter acct number");
				int acctNum = s.nextInt();
				int val = findAcct(acctNum);
				if (val != -1) {
					System.out.println(read(val).toString());
				} else {
					System.out.println("Acct not Found");
				}
			} else if (response.equalsIgnoreCase("o")) {
				System.out.println("Enter Owner Name");
				String owner = s.next();
				int val = findAcct(owner);
				if (val != -1) {
					System.out.println(read(val).toString());
				} else {
					System.out.println("Acct not Found");
				}
			}

		}
		s.close();
	}
	public static int findAcct(String owner)throws IOException{
		for (int i = 0; i < size(); i++) {
			file.seek(i * RECORD_SIZE);
			String ownerName = "";
			for(int j = 0; j < 10; j++){
				ownerName += file.readChar();
			}
			ownerName.trim();
			if (owner.equalsIgnoreCase(ownerName)) {
				return i;
			}
		}
		return -1;
		
	}
	public static int findAcct(int acctNum) throws IOException {
		for (int i = 0; i < size(); i++) {
			file.seek((i * RECORD_SIZE)+20);
			if (acctNum == file.readInt()) {
				return i;
			}
		}
		return -1;
	}

	public static void openFile(String filename) throws FileNotFoundException {
		file = new RandomAccessFile(new File(filename), "rw");
	}

	public static void closeFile() throws IOException {
		file.close();
	}

	public static void write(int n, String ownerName, int num, double bal) throws IOException {

		file.seek(n * RECORD_SIZE);
		
		for(int i = 0; i < 10; i++){
			if(i < ownerName.length())
				file.writeChar(ownerName.charAt(i));
			else
				file.writeChar(' ');
		}
		//file.writeUTF(appendedName);
		file.seek((n * RECORD_SIZE)+20);
		file.writeInt(num);
		file.writeDouble(bal);
	}

	public static BankAccount read(int n) throws IOException {
		file.seek(n * RECORD_SIZE);
		String ownerName = "";
		for(int i = 0; i < 10; i++){
			ownerName += file.readChar();
		}
		file.seek((n * RECORD_SIZE)+20);
		int acctNum = file.readInt();
		double balance = file.readDouble();
		return new BankAccount(ownerName, balance);
	}

	public static int size() throws IOException {
		return (int) (file.length() / RECORD_SIZE);
	}
}
