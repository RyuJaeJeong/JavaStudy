package chap03;

/**
 * 산술 연산자 학습
 * @author R2j
 *
 */
public class Sample01 {

	public static void main(String[] args) {
		 //사과 10개가 있습니다.
		 int apples = 10;
		 //2명의 친구가 있습니다.(본인도 있으니 총 3명)
		 int people = 2+1;
		 //사과를 나눠 먹으면 
		 int remainder = apples%people;
		 System.out.println("나머지 :: " + remainder);
	}

}
