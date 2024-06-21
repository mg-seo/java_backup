package day10.poly.basic;
//하나의 클래스 파일에는 여러 클래스 선어 가능
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b;
	A a2 = new B();
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	
	Object o1 = a;
	Object o2 = 3.14;
	Object o3 = "홍길동";
	Object o4 = new B();
}
