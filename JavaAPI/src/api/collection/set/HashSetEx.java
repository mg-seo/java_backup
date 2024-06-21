package api.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("spring");
		set.add("java"); //java 2개 넣었지만 한개만 들어감
		set.add("python");
		set.add("oracle");
		set.add("jsp");
		System.out.println(set.size());
		System.out.println(set.toString());
		
		set.remove("java"); //값으로 삭제
		//set 은 순서가 없는 바구니 형태이기에 .get()이 없다
		//set 에 들어있는 값을 전부 확인하려면, 반복자 개념을 사용해서 확인해야함
		Iterator<String> iter = set.iterator(); //set 요소를 반복자형태로 바꿈
		while(iter.hasNext()) {
			System.out.println(iter.next());			
		}
		
		for(String s : set)System.out.println(s);
		
	}
}
