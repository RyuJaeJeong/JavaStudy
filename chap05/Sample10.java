package chap05;

public class Sample10 {
	public static void main(String[] args) {
		int j = 1;
		do {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
			j++;
		} while (j<=5);
	}
}
