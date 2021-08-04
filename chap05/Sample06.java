package chap05;

public class Sample06 {
	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {
			System.out.println("=======" + i + "단" + "======");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j );
				break;
			}
			if(true) continue;		//조건식으로 돌아가기때문에 12라인에 개행처리가 되지 않는다.
			System.out.println();
		}
	}
}
