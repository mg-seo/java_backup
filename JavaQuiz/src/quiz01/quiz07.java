package quiz01;

import java.util.Scanner;

public class quiz07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String b = scan.next();
		int c = scan.nextInt();
		
		switch (b) {
		case "+": 
			System.out.println(a + c);
			break;
		case "-": 
			System.out.println(a - c);
			break;
		case "*": 
			System.out.println(a * c);
			break;
		case "/": 
			System.out.println(a / c);
			break;

		default:
			System.out.println("잘못입력");
			break;
		}
		
		
	}
}
