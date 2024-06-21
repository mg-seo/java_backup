package quiz01;

import java.util.Scanner;

public class quiz16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int i = 0;
		int sum = 0;
		
		if(a > b) i = b;
		else if(a < b) {
			i = a; a = b;
		}
		else i = a + 1;
		while(i <= a) {
			sum += i; i++;
		}
		System.out.println(sum);
	}
}
