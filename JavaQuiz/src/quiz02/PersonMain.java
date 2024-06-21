package quiz02;

public class PersonMain {
	public static void main(String[] args) {
		Person man = new Person("홍길동", 25, 167);
		man.info();
		
		System.out.println("------------");
		
		Person girl = new Person();
		girl.name = "김미영";
		girl.age = 21;
		girl.tall = 153;
		girl.info();
		
	}
}
