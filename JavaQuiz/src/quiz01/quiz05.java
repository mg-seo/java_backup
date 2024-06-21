package quiz01;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double height = scan.nextDouble();
		int age = scan.nextInt();
		
		if(height >= 140 && age >= 8)System.out.println("탑승가능");
		else System.out.println("탑승불가능");
		
		
	}
	
}
