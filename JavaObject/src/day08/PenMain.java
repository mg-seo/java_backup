package day08;

public class PenMain {
	public static void main(String[] args) {
		//클래스명 변수명 = new 클래스명();
		Pen black = new Pen();
		black.ink = "검정색";
		black.price = 2000;
		black.company = "모나미";
		black.write();
		
		Pen red = new Pen();
		red.ink = "빨간색";
		red.price = 1000;
		red.company = "하이테크";
		red.write();
		
		black.info();
		red.info();
		
		System.out.println("---Variable---");
		Variable var = new Variable();
		var.printNum(2);
	}
}
