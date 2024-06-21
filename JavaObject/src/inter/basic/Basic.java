package inter.basic;

public class Basic implements Inter1 {
	/*
	 * 인터페이스의 구현(상속) 키워드 implements
	 * 인터페이스에 선언된 추상메서드는 자식에서 반드시 오버라이딩 해야한다
	 */
	@Override
	public void method01() {
		System.out.println("Inter1 overried method01");
		
	}
	
}
