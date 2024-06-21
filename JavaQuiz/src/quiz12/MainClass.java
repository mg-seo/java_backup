package quiz12;

public class MainClass {
	public static void main(String[] args) {
		Unit m1 = new Marine(1, 1);
		Unit m2 = new Marine(2, 2);
		Unit t1 = new Tank(5,5);
		Unit d1 = new Dropship(4,4);
		
		m1.move(1, 2);
		m1.location();
		m1.move(1, 2);
		m1.location();
		
		
	}
}
