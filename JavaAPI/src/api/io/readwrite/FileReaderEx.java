package api.io.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx {
	public static void main(String[] args) {
		//2바이트라 문자읽기 적합
		String path = "D:\\course\\java\\upload\\hello2.txt";
		Reader rd = null;
		try {
			rd = new FileReader(path);
			while(true) {
				int word = rd.read();
				if(word == -1)break;
				System.out.print((char)word);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				rd.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
