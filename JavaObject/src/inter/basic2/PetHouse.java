package inter.basic2;

public class PetHouse {
	/*
	 * 1.메서드생성 carePet()
	 * 매개변수 - 펫들의 공통부모타입
	 * 기능 - instanceof 사용해서 적합한 펫타입으로 캐스팅
	 * 반환 - x
	 */
	public void carePet(IPet pet) {
		if(pet instanceof Cat) {
			Cat c = (Cat)pet;
			c.playing();
			c.eating();
		} else if(pet instanceof Dog) {
			Dog d = (Dog)pet;
			d.playing();
			d.eating();
		} else if(pet instanceof GoldFish) {
			GoldFish g = (GoldFish)pet;
			g.playing();
			g.swimming();
		}
	}
	/*
	 * 2.메서드생성 petInfo()
	 * 매개변수 - IPet[]
	 * 기능 - 배열반복
	 * 반환 - x
	 */
	public void petInfo(IPet[] arr) {
		for(IPet pet : arr) {
			pet.playing();
		}
	}
}
