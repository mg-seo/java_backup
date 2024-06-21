package quiz05;

public class Account {
	String name;
	String password;
	int balance;
	
	Account(String nm, String pw, int bl){
		name = nm;
		password = pw;
		balance = bl;
	}
	void deposit(int cash) {
		balance += cash;
	}
	void withdraw(int cash) {
		balance -= cash;
	}
	int getbalance() {
		return balance;
	}
	
	
}
