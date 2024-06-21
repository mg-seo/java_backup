package api.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
//		2) ArrayList
//		=> 배열기반으로 리스트
//		=> 가장많이 사용함
//		=> 인덱스(o), 순서(o), 값의 중복(o)
//		=> 배열기반으로 만들어지기 때문에, 삽입 삭제가 많이 일어나면, 속도적으로 불리함
		
		ArrayList<String> list = new ArrayList<>();
		//값 추가
		list.add("java");
		list.add("jsp");
		list.add("git");
		list.size();
		
		//배열 -> 리스트
		String[] arr = {"a", "b", "c", "d", "e"};
		List<String> newList = Arrays.asList(arr);
		
		//리스트 병합
		list.addAll(newList);
		System.out.println(list.toString());
		
		//리스트에 값의 포함여부 확인
		if(list.contains("c")) System.out.println("c 포함");;
		
		
	}
}
