package quiz17;

import java.util.Scanner;

public class ListQuiz02 {
	public static void main(String[] args) {
		//간단한 회원정보 관리 프로그램
		Scanner scan = new Scanner(System.in);
		IUserManagement manage = new UserManagement();
		a:while(true) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("[1.회원등록 2.회원전체보기 3.회원정보검색 4.회원정보삭제 5.프로그램종료");
			System.out.print("메뉴: ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				//스캐너로 이름, 나이를 입력받아 User 객체에 저장, 리스트에 추가
				System.out.print("이름: ");
				String name = scan.next();
				System.out.print("나이: ");
				int age = scan.nextInt();
				manage.insert(name, age);
				break;
			case 2:
				//리스트안에 저장된 모든 회원정보를 반복문으로 출력
				manage.printList();
				break;
			case 3:
				//찾을 이름을 입력받아 이름이 있다면 이름과 나이 출력, 없으면 없다고 출력
				System.out.print("이름: ");
				String nameFind = scan.next();
				manage.search(nameFind);
				break;
			case 4:
				//이름 입력받아 리스트에서 삭제
				System.out.print("이름: ");
				String nameDel = scan.next();
				manage.delete(nameDel);
				break;
			case 5:
				System.out.println("종료");
				break a;
			default:
				System.out.println("잘못된 입력");
				break;
			}
			
		}
	}
}
