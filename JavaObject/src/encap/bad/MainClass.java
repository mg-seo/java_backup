package encap.bad;

public class MainClass {
	public static void main(String[] args) {
		
		//은닉이 없다면 누구나 값을 가져갈 수 있고 잘못된 값을 ~~
		MyDate me = new MyDate();
		me.day = 32;
		me.month = 12;
		me.year = 2000;
		me.ssn = "이게 뭥미?";
		String ssn = me.ssn;
		me.info();
	}
}
