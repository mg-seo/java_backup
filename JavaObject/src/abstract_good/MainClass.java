package abstract_good;

public class MainClass {
	public static void main(String[] args) {
//		SeoulStore s = new SeoulStore();
		//추상클래스를 사용하려면, 자식으로 생성해서 부모타입에 저장하고 이를 객체추상화라 한다.
		Store s = new SeoulStore(); //다형성 - 객체 추상화
		s.melon();
		s.apple();
		s.orange();
		s.mango();
		System.out.println(s.getName());
	}	
}
