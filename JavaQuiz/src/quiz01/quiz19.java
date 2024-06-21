package quiz01;

import java.util.Scanner;

public class quiz19 {
	public static void main(String[] args) {
		
		//느린 소수의 합
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= x; i++) {
			int cnt = 0;
			for(int j = 1; j <= i; j++ ) {
				if(i % j == 0) cnt++;
			}
			if(cnt == 2) sum += i;
		}
		System.out.println(sum);
	}
}
