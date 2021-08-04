package chap05;

public class Test03 {
	public static void main(String[] args) {
		for (int i = 1, j = 1; i < 6; i++, j+=2) {
			
			for (int k = 0; k < 6 - (i+1); k++) {
				System.out.print(" ");
			}
			
			for (int h = 1; h <= j; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
