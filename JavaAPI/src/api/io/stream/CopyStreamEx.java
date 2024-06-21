package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyStreamEx {
	public static void main(String[] args) {
		
		String inputPath = "D:\\course\\java\\upload\\img01.png";
		String outputPath = "D:\\course\\java\\uploadcopy\\img02.png";
		InputStream ios = null;
		OutputStream fos = null;
		try {
			ios = new FileInputStream(inputPath);
			fos = new FileOutputStream(outputPath);
			
			byte[] arr = new byte[1000]; //사진크기가 152kb 1000바이트씩 152번
			int result;
			while((result = ios.read(arr)) != -1) { //read(byte) 는 읽은 길이를 반환, 없으면 -1
				fos.write(arr, 0, result); //배열의 0~데이터 길이까지 파일을 씀				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
