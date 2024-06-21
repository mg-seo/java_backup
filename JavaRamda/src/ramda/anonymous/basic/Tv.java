package ramda.anonymous.basic;

public class Tv {
	//
	private int volume;
	public Remote remote;
	
	//생성될 때 리모컨 객체를 갖는다(익명객체)
	public Tv() {
		remote = new Remote() {
			
			@Override
			public void volumeUp() {
				volume++;
			}
			
			@Override
			public void volumeDown() {
				volume--;
			}
			
			@Override
			public void turnOn() {
				System.out.println("Tv On");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv Off");
			}
		};
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
