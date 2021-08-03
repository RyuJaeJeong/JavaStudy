package chap04;

import java.util.Arrays;

public class Sample11 {
	public static void main(String[] args) {
		String [] han = new String [] {"라면", "순대", "떡볶이", "수제비", "갈비탕", "순대국" };
		
		
		//정렬할 배열을 복사합니다.
		String [] han2 = Arrays.copyOf(han, han.length);
		Arrays.sort(han2);
		
		int idx = Arrays.binarySearch(han2, "순대");
		System.out.println(Arrays.toString(han2));
		System.out.printf("순대는 %d 번째에 있습니다.", idx+1);
		
		//이진 탐색은 정렬이되어있어야지 사용할 수 있다.
		
	}
}
