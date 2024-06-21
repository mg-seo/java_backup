package quiz01;

import java.util.Scanner;

public class quiz13 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = scan.next();
		
		for(int i = 0; i < num; i++)System.out.print(str);
		
	}
}
