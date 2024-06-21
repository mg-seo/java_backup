package quiz12;

public class Dropship extends Unit {
	public Dropship(int x, int y) {
		super(x, y, 60);
	}
	@Override
	public void location() {
		System.out.println("현재위치: " + x + ", " + y);
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
