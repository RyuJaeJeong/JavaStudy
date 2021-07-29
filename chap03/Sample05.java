package chap03;

/**
 * 비교연산자
 * @author R2j
 *
 */
public class Sample05 {
	public static void main(String[] args) {
		int x = 1;
		float y = 2.0f;
		
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		
		boolean trueFalse = (x==y);	//비교연산자는 boolean 자료형으로 받아서 사용 할 수도 있다. 
		
		System.out.println("trueFalse : "+trueFalse);
	}
}
