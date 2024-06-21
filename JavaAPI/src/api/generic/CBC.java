package api.generic;

public class CBC<T, C> { //멀티 제네릭
	private T key;
	private C value;
	
	public void put(T key, C value) {
		this.key = key;
		this.value = value;
	}
	public C get(T key) {
		return value;
	}
}
