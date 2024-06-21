package quiz14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryQuiz01 {
	/*
	 * 1. 스캐너를 통해서 정수 2개를 입력받습니다.
	 * 2. 입력받은 값이 정수라면 , 단순히 정수의 합을 출력하고 반복문을 종료하세요
	 * 3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요" 를 출력한 후에 다시 입력받습니다.
	 * 4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워주세요.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				
				System.out.print("정수1: ");
				int a = scan.nextInt(); //입력시 blahblah + enter , blahblah 를 int값으로 받으려는 도중 에러 발생, enter를 받지못해서 다음으로 넘어가지 못함 > 무한반복
				System.out.print("정수2: ");
				int b = scan.nextInt();
				System.out.println("합: " + (a + b));
				break;
				
			}catch (InputMismatchException e) {
				
				System.out.println("정수로만 입력하세요");
				scan.next(); //무한반복 방지 엔터값
				
			}
		}	
		
		System.out.println("정상 종료");
		
	}
}
