package chap07.Sample13_정적중첩클래스;

public class Sample13 {
	public static void main(String[] args) {
		Student.Score score = new Student.Score("류재정");
		score.eng = 23;
		score.mat = 21;
		
		score.showInfo();
	}
}
