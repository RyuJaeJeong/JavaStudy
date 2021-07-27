package chap02;

public class Sample06 {
	public static void main(String[] args) {
		int a = 32767;
		short b = 40;
		
		//b=a; 자동형변환 오류 발생. 작은 자료형에 큰 자료형을 집어넣으려 하기때문
		b = (short)a; //강제 형변환
		System.out.println(b); 
		
		int c = 32768; //short의 최댓값 + 1
		b = (short) c; //명시적 형 변환
		System.out.println(b);  //전혀 다른값이 출력됨.
	}
}
