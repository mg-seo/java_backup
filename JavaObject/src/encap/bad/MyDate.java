package encap.bad;

public class MyDate {
	
	//은닉 x
	public int year;
	public int month;
	public int day;
	public String ssn; //주민번호
	
	public void info() {
		System.out.println("생년월일: " + year + "-" + month + "-" + day);
		System.out.println("주민번호: " + ssn);
	}
	
	
}
