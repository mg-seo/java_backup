package quiz05;

import java.util.Scanner;

public class MyAccount extends Account {

	MyAccount(String nm, String pw, int bl) {
		super(nm, pw, bl);
		// TODO Auto-generated constructor stub
	}

	Scanner scan = new Scanner(System.in);
	
	void withdraw(int cash) {
		while(true) {
			System.out.print("비밀번호: ");
			String pw = scan.next();
			if(pw.equals(password)) {
				if(cash > balance) System.out.println("잔액부족");
				else balance -= cash;
				break;
			} else {
				System.out.println("비밀번호 불일치");
				continue;
			}
		}
	}
	void deposit(int cash) {
		while(true) {
			System.out.print("입금할 계좌의 예금주: ");
			String nm = scan.next();
			if(nm.equals(name)) {
				balance += cash;
				break;
			} else {
				System.out.println("없는 예금주");
				continue;
			}
		}
	}
}
