package chap03;
/**
 * 왼쪽 쉬프트 연산자
 * @author R2j
 *
 */
public class Sample11 {
	public static void main(String[] args) {
		int a = 60;
		int b = -10;
		System.out.println("<<");
		System.out.printf("[%32s] << 4 [%32s] = %d \n", Integer.toBinaryString(a), Integer.toBinaryString(a<<4),a << 4);
		System.out.printf("[%32s] << 4 [%32s] = %d \n", Integer.toBinaryString(b), Integer.toBinaryString(b<<4),b << 4);
				
	}
}
