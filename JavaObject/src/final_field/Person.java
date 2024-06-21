package final_field;

public class Person {
	public final String nation = "대한민국";
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn; //final
		this.name = name;
	}
}
