package chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해보세요 ");
		String word = sc.nextLine();
		char[] chrs = word.toCharArray();
		
		System.out.print("암호와 된 단어 : ");
		for (int i = 0; i < chrs.length; i++) {
			chrs[i] = (char) (chrs[i]-3);	
		}
		System.out.println(Arrays.toString(chrs));
		
		System.out.print("\n복호화 된 단어 : ");
		for (int i = 0; i < chrs.length; i++) {
			chrs[i] = (char) (chrs[i]+3);
		}
		System.out.println(Arrays.toString(chrs));
		
	}
}
