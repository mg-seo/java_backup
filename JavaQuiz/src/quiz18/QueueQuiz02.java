package quiz18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz02 {
	public static void main(String[] args) {
		String[] tiers = {"브론즈", "실버", "골드"};
		Random ran = new Random();
		Queue<Member> member = new LinkedList<Member>();
		for(int i = 0; i < 300; i++) {
			int id = member.hashCode();
			String tier = tiers[ran.nextInt(tiers.length)];
			member.add(new Member(id, tier));
		}
		
		Queue<Member> bronze = new LinkedList<>();
		Queue<Member> silver = new LinkedList<>();
		Queue<Member> gold = new LinkedList<>();
		
		int match = 1;
		while(member.isEmpty() == false) {
			Member m = member.poll();
			if(m.getTier().equals("브론즈")) {
				bronze.offer(m);
				if(bronze.size() == 5) {
					matching(match, bronze);
					match++;
				}
			} else if(m.getTier().equals("실버")) {
				silver.offer(m);
				if(silver.size() == 5) {
					matching(match, silver);
					match++;
				}
			} else if(m.getTier().equals("골드")) {
				gold.offer(m);
				if(gold.size() == 5) {
					matching(match, gold);
					match++;
				}
			}
		}
		System.out.println("원본큐: " + member);
		System.out.println("브론즈큐: " + member);
		System.out.println("실버큐: " + member);
		System.out.println("골드큐: " + member);
	}
	
	public static void matching(int match, Queue<Member> member) {
		System.out.println(match + "번째 팀");
		while(member.isEmpty() == false) {
			System.out.println(member.poll());
		}
	}
	
	
}
