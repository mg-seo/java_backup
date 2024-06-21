package inter.basic;

public class MainClass {
	public static void main(String[] args) {
		Basic b = new Basic();
		b.method01();
		
		/*
		 * 인터페이스도 다형성처럼 부모타입으로 사용가능
		 * 부모타입에 있는 기능만 사용할 수 있고, 오버라이딩된 메서드는 먼저실행
		 */
		Inter1 i1 = new Basic();
		i1.method01();
		
		Basic bb = (Basic)i1;
	}
}
