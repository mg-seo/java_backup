package api.collection.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DequeueEx {
	public static void main(String[] args) {
//		1) Deque(Double end Queue)
//		=> 양방향 큐 (앞뒤 양쪽에서 삽입 삭제가 가능한 구조)
//		=> ArrayDeque 클래스를 사용해서 구현됨
//		=> Deque인터페이스를 상속받음.
		Deque<String> queue = new LinkedList<String>();
		queue.offerFirst("1");
		queue.offer("000");
		queue.offerLast("2");
		System.out.println(queue.toString());
		
		System.out.println(queue.pollLast());
		System.out.println(queue.pollFirst());
		
//		2) PriorityQueue
//		=> 우선순위 큐
//		=> 삽입한 값을 자동으로 정렬해서 가지고 있습니다.
//		=> 문자열 or 객체 비교를 하려면 메서드를 반드시 오버라이딩해서 가져야 합니다.
//		=> PriorityQueue queue = new PriorityQueue() 생성하고 사용합니다.
		Queue<Integer> queue2 = new PriorityQueue<Integer>();
		queue2.offer(2);
		queue2.offer(5);
		queue2.offer(1);
		queue2.offer(4);
		queue2.offer(3);
		System.out.println(queue2.toString()); //순서 이상하게 보임
		for(int i = 0; i < 5; i++ ) { //정렬된 순서대로 나옴
			System.out.println(queue2.poll());
		}
		System.out.println(queue2.toString());
		if(!queue2.isEmpty()) {//큐가 비었으면 true, 아니면 false
			System.out.println("큐가 비어있지 않음");
		}
		
		//UserVO를 담을 수 있는 큐
		//객체를 우선순위 큐에 저장할 때에는 compareTo에 정의된 형식에 따라 우선순위 방법을 지정해줘야함
		//comparable 인터페이스를 구현해서 compareTo 메서드를 

		Queue<UserVO> que = new PriorityQueue<>();
		que.offer(new UserVO("홍길동", 20));
		que.offer(new UserVO("이순신", 30));
		que.offer(new UserVO("홍길자", 40));
		que.offer(new UserVO("신사임당", 50));
		
		System.out.println(que.toString()); //순서 이상하게 보임
		while(que.isEmpty()==false) { //정렬된 순서대로 나옴
			System.out.println(que.poll());
		}
		
	}
}
