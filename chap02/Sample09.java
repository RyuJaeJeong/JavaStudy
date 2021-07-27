package chap02;

public class Sample09 {
	public static void main(String[] args) {
		//문자열을 숫자형으로 변환 
		String a1 = "1234";
		int a2 = Integer.parseInt(a1);
		
		//정수 숫자형을 문자열로 변환
		int b1 = 5678;
		String b2 = Integer.toString(b1);
		String b3 = String.valueOf(b1);
		String b4 = "" + b1;
		
		//실수 숫자형을 문자열로 변환
		float c1 = 1234.5678F;
		String c2 = Float.toString(c1);
		String c3 = String.valueOf(c1);
		String c4 = "" + c1;
		
		System.out.println("String to int :: " + a2 + "\n");
		System.out.println("int to String :: " + b2);
		System.out.println("int to String :: " + b3);
		System.out.println("int to String :: " + b4 + "\n");
		System.out.println("float to String :: " + c2);
		System.out.println("float to String :: " + c3);
		System.out.println("float to String :: " + c4 + "\n");
		
		
		
	}
}
