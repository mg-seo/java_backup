package quiz01;

import java.util.Scanner;

public class quiz17 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int height = scan.nextInt();
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < length; j++) {
				if(i != 0 && i != height - 1) System.out.print(j != 0 && j != length - 1? " " : "*");
				else System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
}
