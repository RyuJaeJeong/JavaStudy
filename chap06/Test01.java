package chap06;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력해주세요 (0을 입력시 종료됩니다) ");
			int in = sc.nextInt();
			if(in == 0) {
				System.out.println("프로그램이 종료됩니다.");
				break;
				
			} else if(in > 0) {
				System.out.println("양수 입니다.\n");
			} else if(in < 0) {
				System.out.println("음수 입니다.\n");
				
			}
			
		}
	}
}
