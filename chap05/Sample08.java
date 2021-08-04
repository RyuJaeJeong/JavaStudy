package chap05;

import java.util.Arrays;

public class Sample08 {
	public static void main(String[] args) {
		String str = "Hello, Java";
		char [] chrs = str.toCharArray();
		System.out.println(Arrays.toString(chrs));
		for (char chr : chrs ) {
			System.out.print(chr);
		}
	}
}
