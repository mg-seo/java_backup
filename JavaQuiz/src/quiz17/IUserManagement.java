package quiz17;

public interface IUserManagement {
	//클래스가 가져야하는 추상메서드
	public void insert(String name, int age);
	public void printList();
	public void search(String nameFind);
	public void delete(String nameDel);
}
