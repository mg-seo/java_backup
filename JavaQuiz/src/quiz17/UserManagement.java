package quiz17;

import java.util.ArrayList;
import java.util.List;

public class UserManagement implements IUserManagement{
	//값을 저장할 리스트
	List<UserVO> list = new ArrayList<UserVO>();
	//메서드
	public void insert(String name, int age) {
		list.add(new UserVO(name, age));
		System.out.println("등록되었습니다.");
	}
	public void printList() {
		if(list.size() != 0) {
			for(UserVO u : list) System.out.println(u.getName() + " " + u.getAge() + "살");
		} else System.out.println("회원이 없습니다.");
	}
	public void search(String nameFind) {
		boolean flag1 = false;
		for(UserVO u : list) {
			if(u.getName().equals(nameFind)) {
				System.out.println(u.getName() + " " + u.getAge() + "살");
				flag1 = true;
				break;
			} 
		}
		if(flag1 == false) System.out.println("찾으시는 회원이 없습니다.");
	}
	public void delete(String nameDel) {
		int idx = -1;
		for(UserVO u : list) {
			if(u.getName().equals(nameDel)) {
				idx = list.indexOf(u);
				break;
			} 
		}
		if(idx != -1) {
			list.remove(idx);
			System.out.println("삭제 완료");
		} else System.out.println("찾으시는 회원이 없습니다.");
		
	}
}
