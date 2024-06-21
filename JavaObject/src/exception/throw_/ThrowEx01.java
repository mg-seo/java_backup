package exception.throw_;

public class ThrowEx01 {
	public static void main(String[] args) {
		try {
			System.out.println(sum(10));
			System.out.println(sum(-5));
		} catch (Exception e) {
			System.out.println("양수 넣어야지");
			System.out.println(e.getMessage());
			e.printStackTrace(); //예외 추적, 멈춘게 아님
		}
		System.out.println("정상 종료");
	}
	
	//1~양수까지의 합
	public static int sum(int a) throws Exception {
		//음수가 들어오면, 예외를 발생시키고 메서드를 강제종료
		if(a < 0) {
			throw new Exception("예외 메시지를 여기에 전달"); //예외 생성문
		}
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
}
