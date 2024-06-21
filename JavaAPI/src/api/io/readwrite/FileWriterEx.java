package api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx {
	public static void main(String[] args) {
		String path = "D:\\course\\java\\upload\\hello2.txt";
		Writer rw = null;
		try {
			rw = new FileWriter(path);
			rw.write("오늘은 6월 4일 입니다.\n아 집에 가고싶다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
