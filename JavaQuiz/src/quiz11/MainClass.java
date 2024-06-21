package quiz11;

public class MainClass {
	public static void main(String[] args) {
		Shape c = new Circle("원형", 5);
		System.out.println(c.getName() + " / " + c.getArea());
		Shape r = new Rect("정사각형", 5);
		System.out.println(r.getName() + " / " + r.getArea());
	}
}
