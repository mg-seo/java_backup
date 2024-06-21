package inter.basic2;

public class GoldFish extends Fish implements IPet {

	@Override
	public void swimming() {
		System.out.println("goldfish swims in the fishbowl");
	}

	@Override
	public void playing() {
		System.out.println("goldfish plays");
	}
	
}
