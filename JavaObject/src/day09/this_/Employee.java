package day09.this_;

public class Employee extends Person {

	String department;
	
	String info() { //매서드 재정의(Overriding) Person에 썼던거 재정의
		return "이름: " + name + ", 나이: " + age + ", 회사: " + department;
	}
	
}
