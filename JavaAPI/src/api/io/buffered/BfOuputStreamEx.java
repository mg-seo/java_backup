package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BfOuputStreamEx {
	public static void main(String[] args) {
		String path = "D:\\course\\java\\upload\\hello3.txt";
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream(path));
			String str = "hello world";
			bos.write(str.getBytes());
			
			//flush를 사용해서 버퍼를 비울때, 글이 써져 내려감
			bos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
