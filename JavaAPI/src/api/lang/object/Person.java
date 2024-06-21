package api.lang.object;

public class Person implements Cloneable{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//obj 가 가지고 있는 이름이 같으면, true 반환
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(p.getName().equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	
	//멤버변수의 값을 한눈에 확인할 수 있도록 overriding / (alt shift s) generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	//clone 오버라이딩
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize(); //deprecated 버전이 올라가면 안쓰임
		System.out.println("객체 소멸됨");
	}
	
}
