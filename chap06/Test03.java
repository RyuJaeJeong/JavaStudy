package chap06;

import java.util.Arrays;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] target = new int[6];
		for (int i = 0; i < target.length; i++) {
			target[i] = random.nextInt(45)+1;
			
			for (int j = 0; j < i; j++) {
				if(target[i]==target[j]) {
					i-- ;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(target));
	}
}
