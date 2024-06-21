package quiz01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.next();
		
		int age = 0;
		int i = 0;
		while(i == 0) {
			System.out.print("나이: ");
			age = scan.nextInt();
			if(age > 0 && age <= 100) i++;
			else System.out.println("다시 입력해주세요.");
		}
		System.out.println("이름 " + name);
		System.out.println(age >= 20 ? "성인입니다." : "미성년자 입니다.");
		
		scan.close();
	}
		
}
