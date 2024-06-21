package day11.static_field;

public class MainClass {
	public static void main(String[] args) {
		
		Count c = new Count();
		c.a++;
		c.b++;
		System.out.println("일반변수: " + c.a);
		System.out.println("정적변수: " + c.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("일반변수: " + c2.a);
		System.out.println("정적변수: " + c2.b);

		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println("일반변수: " + c3.a);
		System.out.println("정적변수: " + c3.b);
		
		System.out.println(Count.b);
		
	}
}
