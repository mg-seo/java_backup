package day10.static_method;

public class Count {
	public int a;
	public static int b;
	
	//일반메서드 - 일반변수, 정적변수 모두 사용가능
	public int method01() {
		a = 10;
		b++;
		return b;
	}
	
	//정적메서드 - static 멤버만 사용가능
	public static int method02() {
		//a = 10; 일반멤버 사용 불가
		//단, 객체생성해서는 접근 가능
		Count c = new Count();
		c.a = 10;
		
		b ++;
		return b;
	}
	
}
