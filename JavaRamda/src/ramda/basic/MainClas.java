package ramda.basic;

public class MainClas {
	public static void main(String[] args) {
		Person p = new Person();
		//익명
		p.greeting(new Say01() {
			@Override
			public void talking() {
				System.out.println("안녕");
			}
		});
		p.greeting(new Say02() {
			
			@Override
			public String talking(String word) {
				return word + "helllo";
			}
		});
		//람다 (매개변수자리) -> {실행문}
		p.greeting(() -> {
			System.out.println("안녕");
		});
		p.greeting((String word) -> {
			return word + "hello";
		});
		//1.매개변수 타입은 생략할 수 있음
		//2.매개변수가 1개라면 ()도 생략가능
		//3.실행구문이 1줄이라면 {} 생략가능
		//4.한줄구문으로 적었을때 return 생략
		p.greeting(word -> word + ": bye?");
		
		//calculating 메서드를 람다식으로 호출, int * word 반환
		p.calculating((i,word) -> {
			String result = "";
			for(int j = 0; j < i; j++) {
				result+=word;
			}
			return result;
		});
	}
}
