package chap02;

public class Sample10 {
	public static void main(String[] args) {
		String a1 = "abcd";
		char [] a2 = a1.toCharArray();
		
		System.out.print("[");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
		System.out.print("]");
		
		char b1 = 'a';
		String b2 = String.valueOf(b1);
		String b3 = "" + b1;
		
	}
}
