package api.generic;

public class ABC {
	//무엇이든 저장 가능한 마법의 상자 : 무엇이든 저장 할 수 있지만, 값을 사용할 때 올바른 타입으로 형변환을 해야함
	private Object obj;
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getObj() {
		return obj;
	}
}

