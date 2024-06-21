package encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * getter 와 setter
	 * 
	 * getter
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어자 public, 이름은 get + 멤버변수명
	 * 
	 * 
	 * setter
	 * 1. 은닉변수에 값을 저장할 메서드
	 * 2. 접근제어자는 public, 이름은 set + 멤버변수명
	 */
	
	public void setYear(int year) {
		//setter를 사용하면 유효성 검증코드를 넣을 수도 있다.
		if(year < 1 || year > 2024) {
			System.out.println("잘못됨");
			return;
		}
		this.year = year;
	}
	public int getYear(/**/) {
		return year;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("잘못됨");
			return;
		}
		this.month = month;
	}
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("잘못됨");
			return;
		}
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		ssn = ssn.replace("-", "");
		if(ssn.length() != 13) {
			System.out.println("잘못됨");
			return;
		}
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	
}
