package chap07;

public class Sample18 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("재정", 27, 1);
		students[1] = new Student("우정", 26, 1);
		students[2] = new Student("의정", 26, 1);
		
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i].toString());
//		}
		
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}
}
