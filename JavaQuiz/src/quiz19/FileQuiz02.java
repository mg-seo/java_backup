package quiz19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileQuiz02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String path = "D:\\course\\java\\upload\\quiz.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		
		while(true) {
			String input = br.readLine();
			if(input.equals("그만"))break;
			bw.write(input);
			bw.write("\n");
			bw.flush();
		}
		
	}
}
