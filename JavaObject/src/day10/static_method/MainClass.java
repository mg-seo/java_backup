package day10.static_method;

public class MainClass {
	public static void main(String[] args) {
		
		Count c = new Count();
		
		c.method01();
		c.method02();
		
		//static 메서드의 사용
		Count.method02();
	
		test();
	}
	public static void test() {
		
	}
}
