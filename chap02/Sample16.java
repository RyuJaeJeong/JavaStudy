package chap02;

import java.util.Random;

/**
 * @author R2j
 * 난수를 학습합니다.
 */
public class Sample16 {

	
	/*
	 * 난수를 생성해서 출력하는 예제입니다.
	 * @param args
	 * @since 1.0
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(3) + 1; //1~3까지 출력 
		
		System.out.printf("난수 : %d", num);
	}

}
