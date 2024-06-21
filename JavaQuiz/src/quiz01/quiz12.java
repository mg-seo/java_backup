package quiz01;

import java.util.Scanner;

public class quiz12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) sum += i;
		}
		
		System.out.println(sum);
		
	}
}
