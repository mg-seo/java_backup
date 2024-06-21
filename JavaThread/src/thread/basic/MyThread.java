package thread.basic;

public class MyThread implements Runnable{
	
	private int num;
	@Override
	public synchronized void run() {
		for(int i = 1; i <= 10; i++) {
			
			num++; //10번 증가
			
			System.out.println(Thread.currentThread().getName() + " " + num);
			
			try {
				if(Thread.currentThread().getName().equals("threadA")) {
					Thread.sleep(1000); //1초 멈춤					
				} else {
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
