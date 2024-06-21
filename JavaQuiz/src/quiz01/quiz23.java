package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class quiz23 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] name = {"강타", "문희준", "토니안", "이재원", "장우혁"};
		
		a:while(true) {
			System.out.print("수정할 학생의 별명을 입력: ");
			String nn = scan.next();
			for(int i = 0; i < name.length; i++) {
				if(name[i].equals(nn)) {
					System.out.print("변경할 별명: ");
					String cn = scan.next();
					name[i] = cn;
					break a;
				}
			}
			System.out.println("일치하는 별명이 없습니다");
		}
		
		System.out.println(Arrays.toString(name));
	}
}
