package api.generic;

public class MainClass {
	public static void main(String[] args) {
		//저장을 문자열
		ABC abc = new ABC();
		abc.setObj("홍길동"); //문자열을 넣어줬는데
		String str = (String)abc.getObj(); //형변환을 해줘야됨;
		
		//generic
		BBC<String> bbc = new BBC<>();
		bbc.set("안녕하세요");
		String str2 = bbc.getT(); //생성시 형 정의를 해줬기에 형변환 필요 x
		
		//multi generic
		CBC<Integer, String> cbc = new CBC<>();
		cbc.put(123, "일이삼");
		System.out.println(cbc.get(123));
		
		
	}
}
