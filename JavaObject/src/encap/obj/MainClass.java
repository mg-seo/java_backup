package encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		//
		Chef chef = new Chef();
		
		Hotel hotel = new Hotel(new Chef());
		
		hotel.getChef();
		chef.cooking();
	}
}
