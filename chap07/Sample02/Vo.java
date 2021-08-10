package chap07.Sample02;

public class Vo {
	String name;
	int age;
	
	static final int ONE;
	static final int two;
	static final int three;
	
	static {
		System.out.println("스태틱 블록 호출");
		ONE = 1;
		two = 2;
		three = 3;
	}
}
