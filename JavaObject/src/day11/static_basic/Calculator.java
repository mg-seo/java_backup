package day11.static_basic;

public class Calculator {
	//언제 static 멤버를 쓰면 좋을까?
	//계산기마다 다른 값을 가져야하면, 일반멤버변수가 됩니다.
	//계산기마다 원주율은 동일하기 때문에, static 으로 선언하면 좋습니다.
	private String color;
	private int result;
	public static double pi = 3.14;
	
	//일반 멤버변수, 메서드를 참조하는 메서드는 일반 메서드로 만듭니다.
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	//메서드 내부에서 일반 멤버변수를 쓰지않고, 범용성 있게 사용할 메서드는 static 을 붙이면 좋습니다.
	public static double circle(int r) {
		return pi * r * r;
	}
}
