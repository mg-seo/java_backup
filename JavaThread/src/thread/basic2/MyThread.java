package thread.basic2;

public class MyThread extends Thread{
	
	private int num;
	
	@Override
	public void run() {
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
