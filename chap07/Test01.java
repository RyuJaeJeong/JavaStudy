package chap07;

import java.util.Scanner;

public class Test01 {
	
	static int sum;
	
	public static void main(String[] args) {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력하세요");
			int in = sc.nextInt();
			if(in>100) {
				System.out.println("100 보다 큰 값을 입력했어요");
			}else if(in == 0) {
				System.out.println("bye");
				break;
			}else {
				System.out.println(sum(in));
			}
			
		} while (true);
		
		
		
	}
	
	public static int sum(int a) {
		sum += a--;
		if(a == 0) {
			return sum;
		}else {
			return sum(a);
		}
		
		
	}
}