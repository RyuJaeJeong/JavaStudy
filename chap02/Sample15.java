package chap02;

public class Sample15 {

	public static void main(String[] args) {
		final float PI1;	
		PI1 = 3.14f;		//최초값을 선언한다. 이 후 P1 값을 변경하면 오류가 발생한다. 
		//PI = 3.14f;		The final local variable PI may already have been assigned.
		
		//final var PI2; 지역변수를 사용 할 경우 선언 한 뒤 초기화하지 않으면 오류가 발생한다.
		
		final var PI3 = 3.14f; //선언한 후 바로 초기화 
	}

}
