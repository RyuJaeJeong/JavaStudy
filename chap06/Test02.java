package chap06;

import java.util.Random;
import java.util.Scanner;

/**
 * 가위바위보 게임 
 * @author R2j
 *
 */
public class Test02 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		while(true) {
			System.out.print("가위(1) 바위(2) 보(3)!");
			int user = sc.nextInt();
			int com = random.nextInt(3)+1;
			if(user == 0) {
				System.out.println("게임 종료");
				break;
			}else if(user==com) {
				System.out.println("비겼습니다" );
			}else if(user==1&&com==3) {
				System.out.println("이겼습니다.");
			}else if(user==1&&com==2) {
				System.out.println("졌습니다.");
			}else if(user==2&&com==1) {
				System.out.println("이겼습니다.");
			}else if(user==2&&com==3) {
				System.out.println("졌습니다.");
			}else if(user==3&&com==2) {
				System.out.println("이겼습니다.");
			}else if(user==3&&com==1) {
				System.out.println("졌습니다.");
			}
					
		}
		
		
	}
}
