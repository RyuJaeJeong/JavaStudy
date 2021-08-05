package chap05;

import java.util.Arrays;

public class Test07 {
	public static void main(String[] args) {
		int [][] gugudan = new int[8][9];
		for (int i = 0; i < gugudan.length; i++) {
			for (int j = 0; j < 9; j++) {
				gugudan[i][j] = (i+2)*(j+1);
			}
		}
		
		System.out.println(Arrays.deepToString(gugudan));
	}
}
