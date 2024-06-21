package quiz09;

public class MainClass {
	public static void main(String[] args) {
		
		Radio radio = new Radio();
		Tv tv = new Tv();
		Computer computer = new Computer();
		
		MyCart my = new MyCart(1000);
		my.buy(radio);
		my.buy(tv);
		my.buy(computer);
		
		my.info();
	}
}
