package chap05;

public class Sample03 {
	public static void main(String[] args) {
		String str = "Hello, Java";
		char [] chr = str.toCharArray();
		
		for (int i = 0; i < chr.length; i++) {
			System.out.println(chr[i]);
		}
	}
}
