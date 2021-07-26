package chap02;

public class Sample03 {
	//printf 문 지시자표 
	
	/*
	 * 지시자표 
	 * 
	 * %b boolean 
	 * %d 10진수
	 * %ㅇ 8진수 
	 * %x, %X 16진수 
	 * %f 실수형 10
	 * %e, %E 지수형태표현
	 * %c, 문자
	 * %s, 문자열 
	 * %n, 개행
	 * 
	 * 
	 * */
	
	//확장특수문자표 
	/*
	 * \n 개행 또는 줄바꿈이라 읽으며 다음줄의 처음으로 옮긴다
	 * \t 커서를 다음 tab 위치로 이동한다
	 * \r 커서의 위치를 줄의 처음으로 옮긴다. 캐리지 리턴이라고도 불림
	 * \\ '\' 를 표시하기 위한 특수문자
	 * \" 큰따움표를 출력하기 위한 특수문자
	 * \' 작은따움표를 출력하기 위한 특수문자
	 * \b 백스페이스 기능으로 한 칸 앞으로 커서가 이동한다. 
	 * 
	 * 
	 * */
	
	  public static void main(String[] args) {
		byte a1 = -128; //byte 최솟값
		byte a2 = 127;  //byte 최댓값
		short b1 = -32768; //short 최솟값
		short b2 = 32767; //short 최댓값
		int c = 10000; //int는 그냥 숫자를 적는다
		long d = 10000L; //long 자료형은 숫자 뒤에 L이나 l을 꼭 붙입니다.
		float e = 10.1f; //float 자료형 뒤에는 F나 f를 꼭 붙입니다. 
		double f = 10.1; //소수점이 있는 숫자를 입력하면 자동으로 double 로 인식한다 
		
		System.out.printf("byte : %d, \t short : %d%n", a1, b1);
		System.out.printf("int : %d, \t long : %d%n", c, d);
		System.out.printf("float : %f, \t double : %f\n", e, f);
	  }
	
}
