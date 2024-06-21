package quiz01;

import java.util.Scanner;

public class quiz21 {
	public static void main(String[] args) {
		
		// up down 게임
		int n = (int)(Math.random()*101);
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("답: ");
			int m = scan.nextInt();
			cnt++;
			if(m == n) {
				System.out.println("정답 / 시도횟수 " + cnt + "회");
				break;
			}
			System.out.println(m > n ? "down" : "up");
		}
	}
}
