package thread.basic;

public class MainClass2 {
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		
		Thread thread1 = new Thread(m1, "threadA");
		Thread thread2 = new Thread(m1, "threadB");
		
		thread1.start();
		thread2.start();
	}
}
