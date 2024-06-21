package quiz01;

import java.util.Scanner;

public class quiz10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 0;
		while(n > 0) {
			if(n % 4 == 0 && n % 8 != 0)
				cnt++;
			n--;
		}
		System.out.println(cnt);
		
	}
}
