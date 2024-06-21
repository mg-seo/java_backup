package modi.construct.pac1;

public class A {
	
	A a1 = new A(1); //public
	A a2 = new A(true); //default
	A a3 = new A("흥"); //private
	
	public A(int a){} //어디서나
	A(boolean a){} //같은 패키지 안에서만
	private A(String a){} //같은 클래스 안에서만, 외부에서 객채생성 x
	
}
