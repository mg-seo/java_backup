package quiz17;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {
	public static void main(String[] args) {
		
		//1. 숫자를 저장하는 리스트를 만들고, 1~20까지 값을 순서대로 저장
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 20; i++) list.add(i);
		
		//2. UserVO를 저장할 수 있는 리스트를 만들고, User 객체 3개를 저장
		UserVO u1 = new UserVO("홍길동", 20);
		UserVO u2 = new UserVO("이순신", 30);
		
		ArrayList<UserVO> user = new ArrayList<>();
		user.add(u1);
		user.add(u2);
		user.add(new UserVO("세종대왕", 40));
		
		//3. 2번에 저장된 list 안에 이름과 나이를 반복문으로 전부 출력
		for(UserVO u : user) {
			System.out.println(u.getName() + " " + u.getAge() + "살");
		}
		System.out.println("------------------------");
		
		//4. 2번에 저장된 list 안에 홍길동이 있다면, 홍길동 객체의 이름과 나이 출력
		for(UserVO u : user) {
			if(u.getName().equals("홍길동")) {
				System.out.println(u.getName() + " " + u.getAge() + "살");
				break;
			}
		}
		System.out.println("------------------------");
		
		//5. 2번에 저장된 list 안에 홍길동이 있다면, 홍길동 객체 삭제
		int idx = -1;
		for(UserVO u : user) {
			if(u.getName().equals("홍길동")) {
				idx = user.indexOf(u);
				break;
			}
		}
		if(idx != -1) user.remove(idx);
		//확인
		for(UserVO u : user) {
			System.out.println(u.getName() + " " + u.getAge() + "살");
		}
		
	}
}
