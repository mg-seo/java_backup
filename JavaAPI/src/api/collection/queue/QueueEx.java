package api.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
//		=> First In  First Out(FIFO)
//		=> 먼저 들어간 건 먼저 나온다
//		=> 스케줄링 작업에 사용될 수 있음
//		=> 자바에서 Queue인터페이스를 구현한 LinkedList가 큐의 역할을 하게 됩니다.
//		=> 자바에서 Queue인터페이스를 구현한 Deque, PriorityQueue 등이 있습니다.
//		자바에서 기본큐는 LinkedList로 대신해서 사용합니다.
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("홍길동"); //뒤에서 추가
		queue.offer("이순신"); //뒤에서 추가
		queue.offer("홍길자");
		
		System.out.println(queue.toString());
		
		String n = queue.poll(); //FIFO 앞에서 삭제
		System.out.println(n); //값을 반환하고, 큐에서 삭제
		
		String n2 = queue.peek();
		System.out.println(n2); //값을 확인만하고, 삭제안함
		
		//링크드리스트를 링크드리스트타입에 저장하면, list 기능과 queue 기능을 둘 다 사용가능
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.offer("b");
		list.offer("c");
		list.addFirst("앞");
		list.addLast("뒤");
		
		System.out.println(list.toString());
		
		System.out.println(list.remove(0));
		System.out.println(list.poll());
		
		System.out.println(list.get(0));
		System.out.println(list.peek());
		
		
		
	}
}
