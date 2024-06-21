package day08;

public class Variable {
	//멤버변수
	int a; //기본값으로 자동 초기화
	
	//지역변수
	void printNum(int c) {
		int b = 1;
		System.out.println("멤버변수: " + a);
		System.out.println("지역변수: " + b);
		System.out.println("매개변수: " + c); //매개변수도 지역변수의 일종
	}
}
