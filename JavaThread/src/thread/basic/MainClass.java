package thread.basic;

public class MainClass {
	public static void main(String[] args) {
		
		//runnable interface 를 상속받은 경우는, thread 객체를 생성해서 동작시킵니다.
		//객체 n개, 스레드를 n개로 동작(따로따로)
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		
		Thread thread1 = new Thread(m1, "threadA");
		Thread thread2 = new Thread(m2, "threadB");
		
		thread1.start();
		thread2.start();
		
		
		System.out.println("main thread 정상종료");
	}
}
