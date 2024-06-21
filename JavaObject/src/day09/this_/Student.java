package day09.this_;

public class Student extends Person {
	
	String studentId;
	
	Student(String name, int age, String studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	String info() { //매서드 재정의(Overriding) Person에 썼던거 재정의
		return "이름: " + name + ", 나이: " + age + ", 학번: " + studentId;
	}
	
}
