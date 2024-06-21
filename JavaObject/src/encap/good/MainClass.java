package encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
//		me.setYear(2025);
		me.setYear(2023);
		int year = me.getYear();
		System.out.println(year);
		
		me.setSsn("001234-1234567");
		String ssn = me.getSsn();
		System.out.println(ssn);
		
	}
}
