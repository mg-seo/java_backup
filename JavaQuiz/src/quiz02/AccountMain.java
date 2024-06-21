package quiz02;

public class AccountMain {
	public static void main(String[] args) {
		Account acc = new Account("서무경", "1234", 100000000);
		
		acc.deposit(50000);
		
		acc.withdraw(1000000);
		
		int bal = acc.getbalance();
		System.out.println(acc.name + "님의 계좌 잔액은 " + bal + "원 입니다.");
	}
}
