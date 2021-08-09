package chap06;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int com;
		int user;
		int counter = 0;
		com = random.nextInt(5) + 1;
		while(true) {
			System.out.print("뭘까요 ");
			
			user = sc.nextInt();
			counter++;
			if(com==user) {
				break;
			}else {
				System.out.println("땡 다시!");
				continue;
			}
		}
		System.out.printf("총 %d 회 만에 맞추셨습니다.", counter);
				
	}
	
}
