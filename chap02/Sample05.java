package chap02;

public class Sample05 {
	
	public static void main(String[] args) {
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";	//id=22 로 str1 과 같은 주소값을 참조하고있다
		str1 = "안녕히 계세요";		// str1 의 id = 28로 변경되고 기존과 다른 주소값을 참조하게된다
		int a = 10;	//int 에는 메모리 id 없이 10이라는 값이 들어가있다는 것을 확인 할 수 있다.
		int b = 10;
		System.out.println(str1 + " " + str2);
		
	}
	
	
}
