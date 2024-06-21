package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) {
		/*
		 * Input이 붙어있는 클래스는 1바이트 기반의 입력스트림 클래스입니다
		 * 1. 파일을 읽어들이는데 사용하는 클래스가 FileInputStream
		 * 
		 */
		String path = "D:\\\\course\\\\java\\\\upload\\\\hello.txt";
		InputStream ios = null;
		try {
			ios = new FileInputStream(path);
			//1바이트씩 읽기
//			while(true) {
//				int data = ios.read();
//				if(data == -1) {
//					break;
//				} System.out.println((char)data);
//			}
			//바이트배열을 반복시켜 글자 출력
			byte[] arr = new byte[100];
			int length = ios.read(arr);
			int i  = 0;
			System.out.println(Arrays.toString(arr));
			while(i < length) {
				System.out.print((char)arr[i]);
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ios.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
