package chap04;

public class Sample03 {
	public static void main(String[] args) {
		int [] num1 = new int[3];
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		int [] num2 = {10,20,30};
		
		System.out.printf("배열의 갯수는 %d개 입니다.", num1.length);
		System.out.printf("%n배열의 갯수는 %d개 입니다.", num2.length);
	}
}
