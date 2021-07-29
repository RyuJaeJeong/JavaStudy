package chap03;

/**
 * 복합대입연산자
 * @author R2j
 *
 */
public class Sample13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 = 3;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num1 = num1 + 3;
		num2 += 3;
		System.out.println("=== + 3");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num1 = num1 - 3;
		num2 -= 3;
		System.out.println("=== - 3");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num1 = num1 * 3;
		num2 *= 3;
		System.out.println("=== * 3");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num1 = num1 / 3;
		num2 /= 3;
		System.out.println("=== / 3");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}

}
