package day10.poly.basic2;

public class Employee extends Person {

	String department;
	
	Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

	String info() { //매서드 재정의(Overriding) Person에 썼던거 재정의
		return "이름: " + name + ", 나이: " + age + ", 회사: " + department;
	}
	
}
