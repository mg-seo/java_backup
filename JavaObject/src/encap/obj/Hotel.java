package encap.obj;

public class Hotel {
	//호텔이 쉐프를 필요로 한다면?
	private Chef chef;
	
	//호텔이 생성될 때, 쉐프를 초기화
	public Hotel() {
		this.chef = new Chef();
	}
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//getter / setter - 객체를 매개변수로 받는, 객체를 반환하는 모형
	public Chef getChef() {
		return chef;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	
}
