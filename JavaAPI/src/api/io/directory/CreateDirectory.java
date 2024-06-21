package api.io.directory;

import java.io.File;

public class CreateDirectory {
	public static void main(String[] args) {
		//자바에서는 외부경로로 폴더를 생성할 때 File클래스를 사용합니다.
		String path = "D:\\course\\java\\upload\\뉴폴더";
		try {
			File file = new File(path);
			//폴더가 있는지 확인하고 생성
			if(!file.exists()) {
				file.mkdir();
				System.out.println("생성완료");
			} else {
				System.out.println("이미 존재함");
			}
			//폴더삭제
//			if(file.exists()) {
//				file.delete(); //빈폴더의 경우 삭제
//				System.out.println("삭제완료");
//			} else {
//				System.out.println("삭제할 폴더가 없음");
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
