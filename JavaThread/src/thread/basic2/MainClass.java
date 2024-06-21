package thread.basic2;

public class MainClass {
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		m1.setName("threadA");
		m1.start();
		
		MyThread m2 = new MyThread();
		m2.setName("threadB");
		m2.start();
		
		System.out.println("main thread close");
	}
}
