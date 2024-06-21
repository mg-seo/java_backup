package modi.member.pac1;

public class A {

	public int var1;
	int var2;
	private int var3;
	
	public void method01() {}
	void method02() {}
	private void method03() {}
	
	//생성자
	public A() {
		var1 = 1;
		var2 = 2;
		var3 = 3;
		method01();
		method02();
		method03();
	}
	
	///////////////////
	//같은 패키지 접근 가능, 다른 패키지의 경우 상속 후 super 통해 가능
	protected int var;
	protected A(int i ) {
		
	}
	protected void method() {
		
	}
	
}
