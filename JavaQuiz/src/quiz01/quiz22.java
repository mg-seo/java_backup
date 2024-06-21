package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class quiz22 {
	public static void main(String[] args) {
		//배열이 주어질때, 배열 요소중 가장 큰 값 하나만 출력
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = 0;
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			int x = (int)(Math.random()*101);
			arr[i] = x;
			if(arr[i] > max) max = arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
		
	}
}
