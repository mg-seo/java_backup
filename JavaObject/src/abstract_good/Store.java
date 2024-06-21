package abstract_good;

public abstract class Store {
	/*
	 * 추상메서드는 abstract 를 붙이고, 반드시 자식에서 오버라이딩 하게 됩니다.
	 * 추상메서드는 {}가 없는 메서드입니다.
	 * 추상메서드를 가지려면, 추상 클래스가 되어야 합니다.
	 * 추상클래스는 객체로 생성할 수 없습니다.
	 * 대신, 일반멤버변수, 생성자, 일반메서드 모두 가질 수 있습니다.
	 */
	//메뉴메서드
	private String name = "호식이 1+1과일지점";
	
	public Store() {
		System.out.println("추상클래스의 생성자 호출");
	}
	
	public abstract void melon();
	public abstract void apple();
	public abstract void orange();
	
	public void mango() {
		System.out.println("본점에서만 판매하는 태국산 망고");
	}
	
	public String getName() {
		return "상호명: " + name;
	}
}
