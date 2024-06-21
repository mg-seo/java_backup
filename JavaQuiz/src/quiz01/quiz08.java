package quiz01;

import java.util.*;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;

public class quiz08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		Integer[] arr = {a, b, c};
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) System.out.println(arr[i]);
			else System.out.print(arr[i] + " ");
		}
	}
}
