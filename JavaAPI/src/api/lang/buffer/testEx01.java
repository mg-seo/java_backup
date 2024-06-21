package api.lang.buffer;

public class testEx01 {
	public static void main(String[] args) {
		
		//일반 문자열과 빠른 문자열의 속도비교
		
		//일반 문자열 더하기
		long start1 = System.currentTimeMillis();
		String s = "";
		for(int i  = 1; i <= 200000; i++) {
			s += "a";
		}
		long end1 = System.currentTimeMillis();
		System.out.println("소요시간:" + (end1 - start1) * 0.001);
		
		//빠른 문자열 더하기
		long start2 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i  = 1; i <= 200000; i++) {
			sb.append("a");
		}
		long end2 = System.currentTimeMillis();
		System.out.println("소요시간:" + (end2 - start2) * 0.001);
	}
}
