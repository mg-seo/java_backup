package final_field;

public class MainClass {
	public static void main(String[] args) {
		Person p1 = new Person("123", "홍길동");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		Person p2 = new Person("333", "이순신");
//		p2.ssn = "123"; final 값 변경 금지
		System.out.println(p2.ssn);
		
		//상수의 사용
		System.out.println(Constant.PI);
		System.out.println(Constant.EARTH_RADIUS);
		System.out.println(Constant.VERSION);
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Integer.MAX_VALUE);;
	}
}
