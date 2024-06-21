package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BfReaderEx {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("입력: ");
//		String str = br.readLine();
//		System.out.println(str);
		String path = "D:\\course\\java\\upload\\hello4.txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));
			
			String str;
			while((str=br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
		
	}
}
