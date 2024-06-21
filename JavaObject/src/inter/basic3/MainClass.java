package inter.basic3;

public class MainClass {
	public static void main(String[] args) {
		
		Printed print = new Samsung();
		print.print("hello world");
		print.colorPrint("good bye", "black");
		print.copy(5);
		
		
	}
}
