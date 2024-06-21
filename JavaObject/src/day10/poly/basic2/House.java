package day10.poly.basic2;

public class House {
	//멤버변수에 Student Teacher Employee
//	private Student[] students = new Student[100];
//	private Teacher[] teacher = new Teacher[100];
//	private Employee[] employee = new Employee[100];
	
	private Person[] people = new Person[100];
	private int index = 0;
	//멤버변수에 순서대로, Person 들을 저장하는 메서드
	public void checkIn(Person p) {
		people[index] = p; index++;
	}
	//배열에 저장된 회원의 이름을 출력
	public void confirm() {
		for(int i = 0; i < index; i++) {
			System.out.println(people[i].info());
		}
	}
}
