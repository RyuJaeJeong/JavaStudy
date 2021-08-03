package chap04;

import java.util.Arrays;

public class Sample09 {
	public static void main(String[] args) {
		String han1[] = {"라면", "순대", "떡볶이", "수제비", "갈비탕", "순대국" };
		
		String [] han2 = Arrays.copyOf(han1, han1.length-1);
		String [] han3 = Arrays.copyOf(han1, han1.length-2);
		String [] han4 = Arrays.copyOf(han1, han1.length-3);
		String [] han5 = Arrays.copyOf(han1, han1.length-4);
		String [] han6 = Arrays.copyOf(han1, han1.length-5);
		
		System.out.println("길이는 " + han1.length);
		System.out.println(Arrays.toString(han2));
		System.out.println(Arrays.toString(han3));
		System.out.println(Arrays.toString(han4));
		System.out.println(Arrays.toString(han5));
		System.out.println(Arrays.toString(han6));
		
		System.out.println("첫번째와 마지막 요소를 제거하고 출력 하려면");
		System.out.println(Arrays.toString(Arrays.copyOfRange(han1, 1, han1.length-1)));
	}
}
