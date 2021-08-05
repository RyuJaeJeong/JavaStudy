package chap05;

public class Test04 {
	public static void main(String[] args) {
		String temp = "";
		
		for (int i = 2; i <= 100; i++) {
			boolean f = true;
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					f = false;
				}
				
			}
			if(f) System.out.print(i + ", ");
		}
	}
}
