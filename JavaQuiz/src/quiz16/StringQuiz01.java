package quiz16;

import java.util.Scanner;

public class StringQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 공백을 포함한 id를 입력받습니다.
		 * 2. 공백을 제거한 아이디가 5글자 미만이면, 다시 입력받으세요.
		 * 3. 아이디는 소문자이어야 합니다.
		 * 
		 * 아이디가 5글자 이상이면, "아이디가 등록되었습니다"를 출력하고 프로그램 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("사용할 id를 입력: ");
			String id = scan.nextLine();
			String temp1 = id.trim().replace(" ", "");
			String temp2 = id.toLowerCase();
			if(temp1.length() < 5) {
				System.out.println("5글자 이상 입력하세요");
				continue;
			} else if(!temp2.equals(id)) {				
				System.out.println("소문자로 입력하세요");
				continue;
			}
			System.out.println("id가 등록되었습니다");
			break;
			
		}
		
	}
	
}
