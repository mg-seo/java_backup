package inter.basic2;

public class Dog extends Animal implements IPet {

	@Override
	public void eating() {
		System.out.println("dog eats feed");
	}

	@Override
	public void playing() {
		System.out.println("dog plays");
		
	}

}
