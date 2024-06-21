package quiz10;

public class MyArrays {
	/*
	 * Arrays.toString 메서드 만들기
	 * 1. MyArrays는 외부에서 객체로 생성할 수 없어야 됩니다.
	 *  -> 생성자에 접근제어자를 이용해서 객체생성을 하지못하도록
	 * 2. 메서드 호출시에는 static 키워드를 이용해서 사용하도록 만들어줍니다.
	 * 3. int[] 이나 String[] 이나 char[] 이 전달되더라도 동일하게 동착하도록 메서드 오버로딩
	 */
	private MyArrays() {}
	
	public static String toString(int[] arr) {
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i != arr.length - 1) str += ", ";
		}
		str += "]";
		return str;
	}
	public static String toString(String[] arr) {
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i != arr.length - 1) str += ", ";
		}
		str += "]";
		return str;
	}
	public static String toString(char[] arr) {
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i != arr.length - 1) str += ", ";
		}
		str += "]";
		return str;
	}

}
