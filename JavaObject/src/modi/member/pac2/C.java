package modi.member.pac2;

import modi.member.pac1.A;

public class C {

	public C() {
		A a = new A();
		a.var1 = 1;
//		a.var2 = 2; //다른패키지
//		a.var3 = 3; //다른 클래스
		a.method01();
//		a.method02(); //다른패키지
//		a.method03(); //다른 클래스
		
//		A aa = new A(1);
//		aa.var = 1;
//		aa.method(); //다른패키지
	}
	
}
