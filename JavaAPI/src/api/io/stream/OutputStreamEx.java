package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		/*
		 * Output이 붙어있는 클래스는 1바이트 기반의 출력스트림 클래스입니다
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다
		 * 2. io패키지에 모든 클래스는 throws가 있어서, try~catch블록과 함께 사용합니다
		 * 
		 */
		String path = "D:\\course\\java\\upload\\hello.txt"; //파일명을 포함한 경로
		OutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
			String str = "hello world?\n nice to meet you";
			fos.write(str.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
}
