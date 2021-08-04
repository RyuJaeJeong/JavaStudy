package chap05;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		int[] daps = {1,1,0,0,1};
		Scanner sc = new Scanner(System.in);
		System.out.print("정답입력 ");
		String ans_ = sc.nextLine();
		char[] ans = ans_.toCharArray();
		//정답 출력 
		System.out.print("정답 > ");
		for(int dap : daps ) {
			System.out.print(dap);
		}
		System.out.println();
		//결과 
		System.out.println("결과 > ");
		int temp = 0;
		for(char ans__ : ans) {
			System.out.print(
					(ans__&daps[temp++])==1?"o":"x"
					);
			
		}
		
	}
}
