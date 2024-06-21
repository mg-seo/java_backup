package day09.this_;

public class MainClass { //상속
	public static void main(String[] args) {
	
		Person p = new Person();//부모
		Person p2 = new Person("홍길동");
		Person p3 = new Person("홍길자", 20);
		
		System.out.println(p.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		
		Car c = new Car("Lamborghini");
		c.run();
	}
}
