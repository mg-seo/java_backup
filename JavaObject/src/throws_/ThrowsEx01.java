package throws_;

public class ThrowsEx01 {
	public static void main(String[] args) {
		/*
		 * 메서드, 생성자에서 발생되는 예외 떠넘기는 키워드는 throws 입니다.
		 * 
		 * throws 가 붙어있는 메서드 or 생성자를 호출할 때는 예외가 발생할 수 있다는 의미이기 때문에 예외처리를 대신 진행해야 합니다.
		 * 
		 * throws 는 예외처리를 강요할 때 사용합니다.
		 */
		try {
			greeting(10);
		} catch (Exception e) {
			System.out.println("잘못된 인덱스");
		}
		
		//throws 로 만들어져있는 대표적인 메서드
		try {
			Class.forName("클래스명");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다");
		}
		
	}
	
	private static String[] arr = {"홍길동", "이순신", "홍길자"};
	
	public static void greeting(int idx) throws Exception {
		System.out.println(arr[idx]);
	}
}
