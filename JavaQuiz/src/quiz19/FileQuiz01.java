package quiz19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	public static void main(String[] args) {
		//스캐너로 읽을 파일명을 확장자 포함 입력받습니다.
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명(확장자 포함): ");
		String filename = scan.next();
		
		//upload폴더에 파일이 있다면, 이 파일을 uploadcopy로 복사해주세요
		String inputPath = "D:\\course\\java\\upload\\" + filename;
		String outputPath = "D:\\course\\java\\uploadcopy\\copy" + filename;
		InputStream ios = null;
		OutputStream fos = null;
		try {
			ios = new FileInputStream(inputPath);
			fos = new FileOutputStream(outputPath);
			byte[] arr = new byte[1000];
			int result;
			while((result = ios.read(arr)) != -1) {
				fos.write(arr, 0, result);			
			}
		} catch (FileNotFoundException e) {
			//파일이 없으면 "파일명이 없습니다" 예외구문을 출력
			System.out.println("파일명이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				
			}
		}
		
	}
}
