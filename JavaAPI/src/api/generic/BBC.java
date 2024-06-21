package api.generic;

public class BBC<T> { //제네릭은 인터페이스, 클래스에 <타입> 문법
	
	private T t; //타입 미정 상태(생성할 때 지정)
	public void set(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	
}
