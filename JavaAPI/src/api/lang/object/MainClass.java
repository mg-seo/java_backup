package api.lang.object;

public class MainClass {
	 // Object 클래스의 메서드들
	public static void main(String[] args) {
		
		Person a = new Person("홍길동");
		Person b = new Person("홍길동");
		
		// 1. equals() : 동일 객체인지 확인
		// 오버라이딩 시켜봄
		boolean result = a.equals(b);
		System.out.println("같은 객체?: " + result);
		
		// 2. toString() : 객체주소를 문자열로 반환 - 오버라이딩해서 많이 사용함.
		System.out.println(a.toString());
		
		// 3. hashCode() : 객체의(거의) 고유한 숫자값 반환
		System.out.println("중복이 없는 고유한 숫자값: " + a.hashCode());
		
		// 4. clone() : 객체를 복사 - protected 로 되어있음, 반드시 오버라이딩
		try { //implements Cloneable
			Object clone = (Person)a.clone();
			System.out.println("복제: " + clone.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		// 5. finalize() : 객체가 소멸되기 전에 실행 - deprecated
		a = null;
		b = null;
		System.gc(); //가비지컬렉터 호출, 순서를 보장하지 않기 때문에 권장 x
		
		
	}
	
	
	
	
}
