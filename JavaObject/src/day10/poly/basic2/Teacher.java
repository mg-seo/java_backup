package day10.poly.basic2;

public class Teacher extends Person {

	String subject;
	
	Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	String info() { //매서드 재정의(Overriding) Person에 썼던거 재정의
		return "이름: " + name + ", 나이: " + age + ", 과목: " + subject;
	}
}
