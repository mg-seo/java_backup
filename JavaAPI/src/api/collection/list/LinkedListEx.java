package api.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
//	3) LinkedList
//	=> 객체(노드) 기반으로 만들어진 리스트(연결리스트)
//	=> 객체(노드) 의 주소값을 참조해서 연결해놓은 구조
//	=> 사용방법은 ArrayList와 동일함
//	=> ArrayList보다 삽입, 삭제는 빠름, 조회는 느림
//	=> Queue를 구현하고 있기 때문에, Queue처럼도 사용이 됩니다.
		List<String> list = new LinkedList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		System.out.println(list.toString());
		String n = list.get(0);
		System.out.println(n);
		list.set(1, "수정");
		System.out.println(list.toString());
		list.remove("홍길동");
		System.out.println(list.toString());
		list.clear();
		
		
		
	}
}
