package chap07.Sample13_정적중첩클래스;

class Student {
	static String name;
	
	public Student(String nme) {
		name = nme;
	}
	
	public static class Score {
		int eng;
		int mat;
		
		public Score(String nme) {
			Student.name = nme;
		}
		
		public void showInfo() {
			System.out.printf("이름 : %s\n수학 : %d\n영어 : %d\n", name, eng, mat);
		}
	}
	
}
