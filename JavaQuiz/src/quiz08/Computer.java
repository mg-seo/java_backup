package quiz08;

public class Computer {	
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard kb;
	private Mouse ms;
	private Monitor mt;
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer() {
		this.kb = new KeyBoard();
		this.ms = new Mouse();
		this.mt = new Monitor();
	}
	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
	public Computer(KeyBoard kb, Mouse ms, Monitor mt) {
		super();
		this.kb = kb;
		this.ms = ms;
		this.mt = mt;
	}
	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
		kb.info(); ms.info(); mt.info();
	}
	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getKb() {
		return kb;
	}
	public void setKb(KeyBoard kb) {
		this.kb = kb;
	}
	public Mouse getMs() {
		return ms;
	}
	public void setMs(Mouse ms) {
		this.ms = ms;
	}
	public Monitor getMt() {
		return mt;
	}
	public void setMt(Monitor mt) {
		this.mt = mt;
	}
	
	
	
}
