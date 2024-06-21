package quiz19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class FileQuiz03 {
	public static void main(String[] args) throws IOException {
		/*
		 * 상혁이가 입사한 회사에서, 매일 오전 아침 7시에 연계사에서 날짜 유형의 CSV파일을 전송해줍니다
		 * ex) 2024_06_04_data.csv
		 * 주의할 점은 내일이 되면 2024_06_05_data.csv가 됩니다
		 * 그래서 상혁이는 아침마다, csv파일을 읽어서 우리의 데이터베이스에 저장하는 프로그램코드를 생성해야합니다
		 */
		
		//년월일
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd");
		String today = now.format(formatter);
		
		//저장할 Data list
		Data<String, Integer, String, String> db = new Data<>();
		
		String path = "D:\\course\\java\\upload\\quiz\\" + today + "_data.csv";
		BufferedReader br = new BufferedReader(new FileReader(path));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				String[] arr = str.split(",");
				db.setAll(arr[0], Integer.parseInt(arr[1]), arr[2], arr[3]);
				//1.buffered 를 사용해서 오늘날짜 패턴 data.csv 파일을 읽어서 한줄에 하나씩 출력을 하세요
//				bw.write(str + "\n");
				//2.읽은 데이터는 , 구분자로 만들어져있는데 , 기준으로 데이터를 분리해서 getter setter를 가지는 data클래스에 저장하고, 이 객체를 리스트에 저장하면 됩니다.
				bw.write(db.getName() + ", " + db.getAge() + ", " + db.getEmail() + ", " + db.getRegion() + "\n");
				bw.flush();
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없음");
		} finally {
			br.close();
			bw.close();
		}
		
		
		
		
	}
	
}
