package quiz14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryQuiz02 {
	public static void main(String[] args) {
		
		int n = (int) (Math.random() *101);
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("1과 100사이의 값: ");
				int a = scan.nextInt();
				if(a > 100 || a < 1) continue; 
				cnt++;
				if(a == n) {
					System.out.println("correct");
					System.out.println("시도횟수: " + cnt);
					break;
				}
				else if(a < n) {
					System.out.println("up");
				}
				else if(a > n) System.out.println("down");
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				scan.next();
			}
		}
		
		
		
	}
}
