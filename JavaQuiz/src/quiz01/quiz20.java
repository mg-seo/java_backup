package quiz01;

import java.util.Random;
import java.util.Scanner;

public class quiz20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int o = 0;
		int x = 0;
		int i = 1;
		while(true) {
			int a = (int)(Math.random() * 101);
			int b = (int)(Math.random() * 101);
			System.out.println(i + "번 문제 / 종료: 0");
			System.out.println(a + " + " + b + " = ?");
			System.out.print("답: ");
			int answer = scan.nextInt();
			if(answer == 0) {
				i--;
				System.out.println("----------------");
				break;
			}
			else if(answer == a + b) {
				System.out.println("정답입니다!");
				o++;
			} else {
				System.out.println("틀렸습니다.");
				x++;
			}
			System.out.println("----------------");
			i++;
		}
		System.out.println("푼 문제: " + i + "개");
		System.out.println("정답: " + o + "개");
		System.out.println("오답: " + x + "개");
		
	}
}
