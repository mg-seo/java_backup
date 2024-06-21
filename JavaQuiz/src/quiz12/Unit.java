package quiz12;

public abstract class Unit {
	public int hp;
	public int x = 0;
	public int y = 0;
	public Unit(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
	public abstract void location();
	public abstract void move(int x, int y);
	public void stop() {
		System.out.println("정지");
		//계속 움직이고 있는게 아닌데 뭔 정지고?
	}
}
