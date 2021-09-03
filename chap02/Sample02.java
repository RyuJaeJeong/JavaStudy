package chap02;

/**
 * <p>자료형을 printf를 이용하여 출력합니다.</p>
 * <p> 첫 번째 p tag 만 description에 보여집니다.
 * @author R2j
 *
 */
public class Sample02 {
	
	
	/**
	 * 기본 생성자 입니다. 
	 */
	public Sample02() {
		// TODO Auto-generated constructor stub
	}
	
	 
	public static void main(String[] args) {
		char J = 74;
		char A = 97;
		char V = 118;
		
		System.out.printf("%c%c%c%c", J,A,V,A);
		
		//char 형의 변수에 아스키코드에 해당하는 정수를 넣어도 똑같이 아스키코드에 대한 값이 출력된다. 
	 }
	
	
	
	/**
	 * <p>메서드입니다.</p>
	 * @since 1.0
	 */
	public void dosomething() {
		
	}
}
