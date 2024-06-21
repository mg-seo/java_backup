package quiz08;

public class MainClass {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		System.out.println("c1");
		c1.computerInfo();
		
		KeyBoard kb = new KeyBoard();
		Mouse ms = new Mouse();
		Monitor mt = new Monitor();
		Computer c2 = new Computer(kb, ms, mt);
		System.out.println("c2");
		c2.computerInfo();
		
		//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
		Monitor monitor = c1.getMt();
		System.out.println("monitor");
		monitor.info();
	}
}
