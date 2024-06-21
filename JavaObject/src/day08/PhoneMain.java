package day08;

public class PhoneMain {
	public static void main(String[] args) {
		Phone red = new Phone();
		red.info();
		
		Phone blue = new Phone("blue");
		blue.info();
		
		Phone green = new Phone("green", 200000);
		green.info();
		
		Phone yellow = new Phone(50000, "yellow");
		yellow.info();
		
		Phone black = new Phone("black", 10000000, "킹갓제네럴");
		black.info();
	}
}
