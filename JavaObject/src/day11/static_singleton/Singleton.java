package day11.static_singleton;

public class Singleton {
	//싱글톤패턴 - 객체가 단 1개만 생성되도록 클래스를 구성해주는 디자인패턴
	
	//1. 외부에서 직접 객체를 생성할 수 없도록, 생성자를 1개로 제한하고 private 을 붙임
	private Singleton() {
		
	}
	//2. 멤버변수로 스스로 객체를 1개 만듭니다.(static)
	private static Singleton instance = new Singleton();
	
	//3. 클래스 외부에서 객체를 요구할 때, getter 메서드를 통해서 2번에 생성해둔 단 1개의 객체를 반환
	public static Singleton getInstance() {
		return instance;
	}
	////////////////////////////
	private String name = "홍길동";
	public String getName() {
		return name;
	}
	
}
