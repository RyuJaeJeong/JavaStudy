package chap06;

import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("전력 사용량을 입력하세요 (201~400kwh) ");
			int in = sc.nextInt();
			long temp = 1600;
			long vat = 0;
			double giban = 0;
			if(in>400||in<201) {
				if(in==0) {
					System.out.println("프로그램 종료");
					break;
				}
				System.out.println("전력 사용량을 잘못 입력하였습니다.");
			}else {
				temp += 200*93.3;
				temp += (in-200)*187.9;
				
				vat = Math.round(temp * 0.1);
				giban = Math.floor(temp*0.037);
				
				temp = (long) (temp + vat + giban);
			}
			temp = (long) (Math.floor(temp/10)*10);
			System.out.printf("%d 원\n", temp);
		}
	}
}
