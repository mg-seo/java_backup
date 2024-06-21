package api.collection.list;
import java.util.Stack;
public class StackEx {
	public static void main(String[] args) {

//		1) Stack
//		=> Last In First Out (LIFO)
//		=> 나중에 들어간게 먼저 나온다.
//		=> push() 데이터삽입, pop() 데이터를삭제
		
		Stack<Integer> stack = new Stack<Integer>();
		
		//값 추가, 동적 크기
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//값 삭제
		int a = stack.pop(); //마지막 값을 삭제하고 리턴함
		System.out.println(a);
		
		//스택값 확인
		System.out.println(stack.toString());
		
		//스택 크기
		System.out.println(stack.size());
		
		//스택에서 값을 얻음
		int b = stack.peek();
		System.out.println(b); //pop 과 다르게 삭제하지 않고 리턴
		
		//스택이 비어있는지 확인
		System.out.println(stack.isEmpty());
		
		
		
	}
}
