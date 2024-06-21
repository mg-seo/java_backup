package throws_;

public class ThrowsEx02 {
	public static void main(String[] args) {
		
		try {
			new ThrowsEx02();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("예외처리");
		}
		
		
	}
	
	
	
	
	//생성자
	public ThrowsEx02() throws Exception {
		System.out.println("생성자호출");
		aaa();
		System.out.println("생성자종료");
	}
	
	public void aaa() throws Exception {
		System.out.println("aaa호출");
		bbb();
		System.out.println("aaa종료");
	}
	public void bbb() throws Exception {
		System.out.println("bbb호출");
		System.out.println(10 / 0);
//		try {
//			System.out.println(10 / 0); //예외
//		} catch (Exception e) {
//			System.out.println("예외처리");
//		}
		System.out.println("bbb종료");
	}
}
