package chap03;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력하세요");
		int score = sc.nextInt();
		char grade = (score>=90)? 'A' : (score>=80)? 'B' : (score>=70)? 'C' : (score>=60)? 'D' : 'F';   
		
		System.out.printf("당신의 등급은 %s 입니다.", grade);
	}
}
