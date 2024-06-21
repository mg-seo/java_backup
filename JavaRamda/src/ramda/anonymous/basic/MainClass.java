package ramda.anonymous.basic;

public class MainClass {
	public static void main(String[] args) {
		Car car = new Tico();
		car.run();
		//매번, Car 를 구현한 클래스가 달라져야한다면?
		//익명개체 문법으로
		Car car2 = new Car() {
			@Override
			public void run() {
				System.out.println("car2");
			}
		};
		car2.run();
		
		Car car3 = new Car() {
			@Override
			public void run() {
				System.out.println("car3");
			}
		};
		
		//Tv 에 있는 리모컨 사용하기
		Tv tv = new Tv();
		tv.setVolume(10);
		tv.remote.volumeUp();
		System.out.println(tv.getVolume());
		tv.remote.volumeDown();
		System.out.println(tv.getVolume());
		tv.remote.turnOn();
		tv.remote.turnOff();
		
		
	}
}
