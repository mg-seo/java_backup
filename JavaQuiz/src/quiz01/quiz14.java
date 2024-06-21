package quiz01;

import java.util.Scanner;

public class quiz14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int[] arr = {1000, 500, 100, 50, 10};
		int[] cnt = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			cnt[i] = x / arr[i];
			x %= arr[i];
			System.out.print(arr[i] + " " + cnt[i] + " ");
		}
	}
}
