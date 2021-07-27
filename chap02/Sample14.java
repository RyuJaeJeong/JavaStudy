package chap02;

public class Sample14 {

	public static void main(String[] args) {
		final float PI;	
		PI = 3.14f;		//최초값을 선언한다. 이 후 P1 값을 변경하면 오류가 발생한다. 
		//PI = 3.14f;		The final local variable PI may already have been assigned.
		int radius = 10;
		float area = radius * radius * PI;
		System.out.println("원의 넓이 : " + area);
	}

}
