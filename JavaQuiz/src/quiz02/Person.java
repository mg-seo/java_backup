package quiz02;

public class Person {
	String name;
	int age;
	int tall;
	
	Person(){
		
	}
	
	
	Person(String pName, int pAge, int pTall){
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	void info() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + tall);
	}
	
}
