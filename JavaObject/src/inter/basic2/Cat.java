package inter.basic2;

public class Cat extends Animal implements IPet {

	@Override
	public void eating() {
		System.out.println("cat eats fish");
	}

	@Override
	public void playing() {
		System.out.println("cat plays");
	}

}
