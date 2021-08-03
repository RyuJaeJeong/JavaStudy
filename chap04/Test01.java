package chap04;

public class Test01 {
	public static void main(String[] args) {
		int [][][] school = new int[3][3][12];
		
		 school[1][0] = new int[9];
		 school[1][2] = new int[10];
		
		 school[2][0] = new int[7];
		 school[2][2] = new int[11];
		 
		
		 
		 for (int i = 0; i < school.length; i++) {
			for (int j = 0; j < school.length; j++) {
				System.out.printf("%d학년 %d반은 총 %d명입니다.\n",i+1,j+1,school[i][j].length);
			}
		}
	}
}
