package chap07.Sample02;

public class Sample02 {
	public static void main(String[] args) {
		Vo vo = new Vo();
		vo.name = "류재정";
		vo.age = 27;
		
		System.out.printf("%s는 %d 살 입니다.\n", vo.name, vo.age);
		System.out.printf("%d + %d = %d", Vo.ONE, Vo.two, Vo.three);
	}
}
