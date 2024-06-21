package quiz01;

import java.util.Scanner;

public class quiz09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력: ");
		int n = scan.nextInt();
		int i = 1;
		while(i <= 9) {
			System.out.println(n + " x "+ i + " = " + (n * i));
			i++;
		}
	}
}
