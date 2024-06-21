package ramda.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass02 {
	public static void main(String[] args) {
		//리스트에 랜덤한 값을 저장
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 100; i++) {
			list.add(new Random().nextInt(100) + 1);
		}
		System.out.println("og /" + list.toString());
		System.out.println("-----------------------------------------------------------");
		
		//중복제거 .distinct, forEach 반환이 stream
		list.stream().distinct().forEach(a -> System.out.print(a+" "));
		System.out.println();
		//다시 컬렉션으로 변환
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(newList.toString());
		
		//걸러내기 .filter 트루인 값만 필터링
		list.stream().filter(t -> t % 2 == 0).forEach(t->System.out.print(t+" "));
		System.out.println();
		
		//정렬 .sorted
		list.stream().filter(t -> t % 2 != 0).sorted().forEach(t -> System.out.print(t+" "));
		System.out.println();
		
		//map - 리턴에 담긴 값으로 새로운 Stream을 생성
		List<String> newList2 = list.stream().map(a -> a % 2 == 0 ? "짝" : "홀").collect(Collectors.toList());
		System.out.println(newList2.toString());
		
		//원본list로 중복제거하고 65보다는 큰 수들만 정렬해서 아스키코드 문자로 변환하여 리스트
		List<Character> newList3 = list.stream()
				.distinct()
				.filter(t -> t >= 65 && t <= 90)
				.sorted()
				.map(t -> (char)t.intValue())
				.collect(Collectors.toList());
		System.out.println(newList3.toString());
		
	}
}
