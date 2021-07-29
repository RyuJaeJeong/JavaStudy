package chap03;

public class Sample14 {
	public static void main(String[] args) {
		//3항 연산자 
		int num = 6;
		String result = ((num%2)==0)? "even" : "odd";
		System.out.println(result+" number");
	}
}
