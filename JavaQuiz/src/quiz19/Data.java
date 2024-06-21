package quiz19;

public class Data<N,A,E,R> {
	
	//변수
	private N name;
	private A age;
	private E email;
	private R region;
	//생성자
	public Data() {
		
	}
	//Getter&Setter
	public void setAll(N name, A age, E email, R region) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.region = region;
	}
	
	public N getName() {
		return name;
	}
	public A getAge() {
		return age;
	}
	public E getEmail() {
		return email;
	}
	public R getRegion() {
		return region;
	}
	

	
}
