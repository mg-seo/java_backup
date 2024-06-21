package day10.poly.basic;

public class MainClass {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = c;
//		다형성이 적용될 때 부모님에 있는 메서드만 사용가능, 오버라이딩된 메서드 먼저 실행
		p.method01();
		p.method02();
		
		System.out.println("--------------------");
		/*
		 * 클래스 캐스팅
		 * 다형성이 적용된 객체는 클래스 캐스팅을 통해서 다시 자신으로 돌아올 수 있습니다.
		 * 다형성이 적용되지 않은 객체는 에러가 발생합니다.
		 */
		Parent pp = new Child();
		Child cc = (Child)pp;
		cc.method03();
		
		Parent ppp = new Parent(); //자식이 아니였다면
		Child ccc = (Child)ppp; //문법은 틀리지 않았지만 에러발생
	}
}
