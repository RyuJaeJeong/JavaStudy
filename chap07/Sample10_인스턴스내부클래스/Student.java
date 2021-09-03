package chap07.Sample10_인스턴스내부클래스;

public class Student {
	String name;
	
	public Student(String nme) {
		name = nme;
	}
	
	public class Score {
		int eng;
		int mat;
		
		public void showInfo() {
			System.out.printf("이름 : %s\n수학 : %d\n영어 : %d\n", name, eng, mat);
		}
	}
	
}
