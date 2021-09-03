
public class Sample16_equals {
	
	public static void main(String[] args) {
		String A = new String("재정");
		String B = "재정";
		String C = "재정";
		

		
		if(A==B) {
			System.out.println("A와 B는 주소가 같습니다.");
		} else {
			System.out.println("A와 B의 주소는 서로 다릅니다.");
		}
		
		if(A.equals(B)) {
			System.out.println("A와 B는 같은 값 입니다.");
		}else {
			System.out.println("A와 B는 다른 값 입니다.");
		}
		
		if(B==C) {
			System.out.println("B와 C는 주소가 같습니다.");
		} else {
			System.out.println("B와 C의 주소는 서로 다릅니다.");
		}
		
		if(B.equals(C)) {
			System.out.println("C와 B는 같은 값 입니다.");
		}else {
			System.out.println("C와 B는 다른 값 입니다.");
		}
		
		
	}
	
	
	
}
