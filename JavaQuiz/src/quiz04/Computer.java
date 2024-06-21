package quiz04;

public class Computer extends Calculator {
	int circle(double r) {
		return (int) (Math.PI * r * r);
	}
	
	double rect(double l) {
		return l * l;
	}
	double rect(double l, double h) {
		return l * h;
	}
	double rect(double l, double h, double d) {
		return l * h * d;
	}
	
}
