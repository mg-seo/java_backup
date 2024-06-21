package day10.poly.basic2;

public class Person {
	//부모클래스 - 공통으로 사용될 기능
	String name;
	int age;
	
	//생성자
	//생성자 연결 = 생성자의 첫번째 줄에서 this()를 사용하여 생성자간 연결이 가능
	Person(String name, int age){
		this.name = name;
		this.age = age;
//		System.out.println("두개짜리 생성자로 호출됨");
	}
	Person(){
		this("이름없음", 1);
	}
	Person(String name){
		this(name,1);
	}
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
}
