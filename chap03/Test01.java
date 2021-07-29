package chap03;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1");
		int num1 = sc.nextInt();
		System.out.println("2");
		int num2 = sc.nextInt();
		
		int result = (num1 > num2) ? num1 : (num1 == num2) ? 0 : num2;
		
		System.out.println("결과는 : " + result);
	}
}
