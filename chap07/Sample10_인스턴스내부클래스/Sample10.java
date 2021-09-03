package chap07.Sample10_인스턴스내부클래스;

public class Sample10 {
	public static void main(String[] args) {
		Student student = new Student("류재정");
		Student.Score studentScore = student.new Score();
		studentScore.eng = 21;
		studentScore.mat = 23;
		studentScore.showInfo();
	}
}
