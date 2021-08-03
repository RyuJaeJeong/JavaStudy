package chap04;

import java.util.Arrays;

public class Sample08 {
	public static void main(String[] args) {
		int[] correct = {1,2,3,4,1,4,3,2,1,3};
		
		int[][]  answers = {
				{1,2,3,4,1,4,3,2,1,3},
				{2,2,3,4,1,4,3,2,1,3},
				{3,2,3,4,1,4,3,2,1,3},
				{4,2,3,4,1,4,3,2,1,3},
				{1,2,3,4,1,4,3,2,1,3}
		};
		
		int no = 0;
		
		for (int [] answer : answers ) {
			no++;
			if (Arrays.equals(correct, answer)) {
				System.out.printf("%d 번 학생은 만점자입니다.\n", no);
			} else {
				System.out.printf("%d 번 학생은 만점자가아닙니다.\n", no);
			}
			
		}
		
	}
}
