package quiz01;

public class MethodQuiz01 {
	public static void main(String[] args) {
		System.out.println(method3(1, 2, 3.6));
		System.out.println(method4(2));
		method5("yo", 3);
		System.out.println(maxNum(2, 5));
		System.out.println(abs(-7));
	}
	
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	
	static String method4(int a) {
		return a % 2 == 0 ? "짝수" : "홀수";
	}
	
	static void method5(String a, int b) {
		for(int i = 0; i < b; i++) System.out.println(a);
	}
	
	static int maxNum(int a, int b) {
		return a > b ? a : b;
	}
	
	static int abs(int a) {
		return a < 0 ? -a : a;	
	}
	
	
	
	
}
