package api.lang.system;

import java.util.Arrays;

public class StringEx01 {
	public static void main(String[] args) {
		
		String str = "홍길동 입니다 안녕하세요";
		String str2 = new String("홍길동");
		String str3 = new String(new char[] {'홍', '길', '동'});
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		//charAt() - 문자열 자르기
		System.out.println(str.charAt(0));
		//substr()
		System.out.println(str.substring(5)); //5미만 절삭
		System.out.println(str.substring(5, str.length())); //5~길이 미만 문자열 추출
		
		//split()
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		//toCharArray()
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//문자열 찾기
		str = "아 좋다 좋아";
		System.out.println(str.indexOf("아")); //"아"가 있는 위치
		System.out.println(str.lastIndexOf("아"));//"아"가 뒤에서부터 찾기 시작해 발견되는 위치
		
		//문자열길이
		System.out.println(str.length());
		
		//알파벳의 대소문자 변경
		str = "Hello World";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//양측 공백제거
		str = "  abc 123  ";
		System.out.println(str.trim());
		//모든 공백제거(문자열 변경)
		System.out.println(str.replace(" ", ""));
		
		//문자열비교
		if("홍길동".equals("홍길동"));
		
		//문자열 대소비교 - 사전등재순을 기준으로
		System.out.println("홍길동".compareTo("이순신")); //뒤에문자가 사전적 앞에
		System.out.println("홍길동".compareTo("홍길자")); //뒤에문자가 사전적 뒤에
		System.out.println("홍길동".compareTo("홍길동"));
		
		//문자열 합치기
		System.out.println(String.join("->", "서울", "대전", "대구", "부산"));
		
		//기본 타입을 -> 문자열로 형변환
		System.out.println(String.valueOf(3) + String.valueOf(3));
		
		//StringBuffer
		StringBuffer sb = new StringBuffer();
		sb.append("bye"); //마지막에 추가
		sb.insert(0, "hello"); //중간에 추가
		sb.replace(0, 5, "good"); //변경
		sb.delete(0, 4); //삭제
		sb.reverse();
		System.out.println(sb);
		
	}
}
