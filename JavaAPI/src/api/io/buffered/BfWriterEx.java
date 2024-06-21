package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class BfWriterEx {
	public static void main(String[] args) {
//		try {
//			Writer w = new OutputStreamWriter(System.out);
//			BufferedWriter bw = new BufferedWriter(w);
//			bw.write("안녕하세요?");
//			bw.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String path = "D:\\course\\java\\upload\\hello4.txt";
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(path));
			bw.write("안녕하세요?\n모두\n잠에서\n일어나");
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
