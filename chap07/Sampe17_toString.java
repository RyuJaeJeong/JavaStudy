package chap07;

public class Sampe17_toString {
	public static void main(String[] args) {
		Student st = new Student("재정", 27, 1);
		System.out.println(st.toString());
	}
}

class Student {
	String name;
	int age;
	int grade;
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
	
}
