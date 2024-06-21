package day08;

public class Calculator {
	int result = 0;
	int add(int a) {
		result += a;
		return result;
	}
	int sub(int a) {
		result -= a;
		return result;
	}
	int mul(int a) {
		result *= a;
		return result;
	}
	int div(int a) {
		result /= a;
		return result;
	}
}
