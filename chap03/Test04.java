package chap03;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int score_ = sc.nextInt();
		
		int score = (score_>=0) ? 0 : score_*-1; 
		
		System.out.printf("출력값은 %d 입니다.", score);
		
	}
}
