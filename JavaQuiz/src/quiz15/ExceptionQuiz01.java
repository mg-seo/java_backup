package quiz15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1. main 에서 scanner 를 사용해서 2개의 정수값을 입력받음
		 * 2. divide(정수 2개) 를 입력받는 메서드에 전달을 해주세요.
		 * 3. divide 메서드에서는 0으로 나눈경우 예외를 강제생성해서 종료하는 구문을 작성해보세요.
		 * 4. main 에서 입력받을 때는, 문자인 경우 예외처리를 진행하고, 다시 입력받으세요.
		 */
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				
				int a = scan.nextInt();
				int b = scan.nextInt();
				
					try {
						System.err.println(divide(a, b));
					} catch (ArithmeticException e) {
						e.printStackTrace();
						break;
					}
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				scan.next();
			}
		}	
	}
	
	public static int divide(int a, int b) throws ArithmeticException {
		if(b == 0) throw new ArithmeticException("0");
		return a / b;
	}
}
