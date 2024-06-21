package trycatch;



public class TrycatchEx03 {
	/*
	 * main 메서드에 실행시 매개값을 주는 방법
	 * 
	 * Run -> run configuration -> arguments
	 * ${string_prompt}
	 * 
	 */
	public static void main(String[] args) {
		
		//두 수의 합을 구하는 코드
		try {
			
			String a = args[0];
			String b = args[1];
			
			int c = Integer.parseInt(a);
			int d = Integer.parseInt(b);
			
			System.out.println("합: " + (c + d));
			
			String str = null;
			str.charAt(0);
			
		} catch (ArrayIndexOutOfBoundsException | ClassCastException e) {
			System.out.println("실행 시 매개값을 2개 입력하세요");
		} catch (NumberFormatException e) {
			System.out.println("매개 값을 숫자로 입력하세요");
		} catch (Exception e) {
			System.out.println("기타 예외");
		}
		
		
	}
}
