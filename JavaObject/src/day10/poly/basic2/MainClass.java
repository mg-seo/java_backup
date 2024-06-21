package day10.poly.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		//배열의 다형성 - 타입을 통일할 수 있음
//		Student s1 = new Student("홍길동", 20, "123123");
//		Student s2 = new Student("김길동", 30, "234234");
//		Student s3 = new Student("이길동", 40, "345345");
//		
//		Teacher t1 = new Teacher("세종대왕", 30, "국어");
//		Teacher t2 = new Teacher("신사임당", 20, "미술");
//		
//		Employee e1 = new Employee("장영실", 20, "개발부"); 
		
//		Student[] students = {s1, s2, s3};
//		Teacher[] teachers = {t1, t2};
//		Employee[] emps = {e1};
		
		Person s1 = new Student("홍길동", 20, "123123");
		Person s2 = new Student("김길동", 30, "234234");
		Person s3 = new Student("이길동", 40, "345345");
		
		Person t1 = new Teacher("세종대왕", 30, "국어");
		Person t2 = new Teacher("신사임당", 20, "미술");
		
		Person e1 = new Employee("장영실", 20, "개발부");
		
		Person[] people = {s1, s2, s3, t1, t2, e1};
		
		for(Person p : people) {
			System.out.println(p.info());
		}
		
		System.out.println("----------------------------------");
		//매개변수에도 다형성이 적용됩니다.
		House h = new House();
		h.checkIn(s1);
		h.checkIn(s2);
		h.checkIn(s3);
		h.checkIn(t1);
		h.checkIn(t2);
		h.checkIn(e1);
		h.confirm();
		
		System.out.println("----------------------------------");
		personInfo(s1); //instanceof
	}
	//메서드 - 매개변수로 Person 타입을 받는
	public static void personInfo(Person p) {
		if(p instanceof Employee) {//p가 Employee 타입이라면 true
			Employee e = (Employee)p;
			System.out.println(e.info());
		} else if(p instanceof Student) {
			Student s = (Student)p;
			System.out.println(s.info());
		} else if(p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		} 
	}
	
	
}
