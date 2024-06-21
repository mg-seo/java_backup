package quiz01;

import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String menu = scan.next();
		
		switch (menu) {
		case "사과": System.out.println("3만원");
			break;
		case "수박": System.out.println("4만원");
			break;
		case "멜론": System.out.println("5만원");
			break;
		case "귤": System.out.println("6만원");
			break;
		default: System.out.println("없는메뉴");
			break;
		}
	}
}
