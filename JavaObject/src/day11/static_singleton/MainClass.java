package day11.static_singleton;

public class MainClass {
	public static void main(String[] args) {
		//3번의 getInstance()로 객체를 끄집어 냅니다.
		Singleton s = Singleton.getInstance();//객체생성법
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s == s2);
		
		String name = s.getName();
		String name2 = s2.getName();
		StringBuilder sb = new StringBuilder();
		sb.append("홍길동");
		name += 'j';
		System.out.println(sb.equals(name2));
		System.out.println(name == name2);
	}
}
