package chap03;
/**
 * 비트연산자 NOT
 * @author R2j
 *
 */
public class Sample10 {
	public static void main(String[] args) {
		int a = 60;
		int b = -10;
		System.out.println("NOT");
		System.out.printf("[%32s] ~ [%32s] = %d ~ %d \n", Integer.toBinaryString(a), Integer.toBinaryString(~a),a,~a);
		System.out.printf("[%32s] ~ [%32s] = %d ~ %d \n", Integer.toBinaryString(b), Integer.toBinaryString(~b),b,~b);
				
	}
}
