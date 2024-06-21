package quiz01;

import java.util.Scanner;

public class quiz18 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		int h = scan.nextInt();
		
		for(int i = 1, k = l - i; i <= h; i++) {
			for(int j = l; j > 0; j--) {
				if(l - k >= j) System.out.print("*");
				else System.out.print(" ");
			}
		k--;
		System.out.println();
		}
		System.out.println("-----------");
		
		for(int i = 0, k = l / 2; i < h; i++) {
			for(int j = 0; j < l; j++) {
				if(j >= k && j < l - k) System.out.print("*");
				else System.out.print(" ");
			}
		k--;
		System.out.println();
		}
		
	}
	

}
