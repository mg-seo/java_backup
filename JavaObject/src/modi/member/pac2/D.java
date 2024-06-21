package modi.member.pac2;

import modi.member.pac1.A;

public class D extends A {
	
	public D() {
		//super.var2 = 1; //default x
		super.var = 1; //protected o
//		A a = new A(1);//직접 생성 불가능
		super.method();
	}
	
}
