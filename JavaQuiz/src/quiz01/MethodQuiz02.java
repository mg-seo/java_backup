package quiz01;

public class MethodQuiz02 {
	public static void main(String[] args) {
		System.out.println(java(5));
		System.out.println(sum(6));
		System.out.println(primeNum(1, 2));
	}
	
	static StringBuilder java(int a) {
		StringBuilder sb = new StringBuilder(); 
		String str;
		for(int i = 0; i < a; i++) {
			sb.append(i % 2 == 0 ? '자' : '바');
		}
		return sb;
	}
	
	static int sum(int a) {
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) sum += i;
		}
		return sum;
	}
	
	static int primeNum(int a, int b) {
		int sum = 0;
		if(a != b) {
			int max = a > b ? a : b;
			int min = a < b ? a : b; 
			for(int i = min; i <= max; i++) sum += i;
		}
		return sum < 0 ? -sum : sum;
	}
	
}
