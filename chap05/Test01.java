package chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자");
		int num = sc.nextInt();
		int [] nums = new int[num];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		}
		
		System.out.println(Arrays.toString(nums));
	}
}
