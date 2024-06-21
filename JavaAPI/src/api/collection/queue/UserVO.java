package api.collection.queue;

public class UserVO implements Comparable<UserVO>{
	
	private String name;
	private int age;
	
	//생성자
	public UserVO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(UserVO o) {
		// 내꺼랑, 매개변수꺼랑 비교해서 음수를 반환시키면 오름차순
		//이름으로 대소비교
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + "]";
	}
	
}
