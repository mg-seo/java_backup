package quiz04;

public class Calculator {
	int result;
	double pi = 3.14;
	
	int add(int num){
		return result += num;
	}
	
	int circle(double r) {
		return (int) (pi * r * r);
	}
	
}
