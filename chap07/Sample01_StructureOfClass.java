package chap07;

public class Sample01_StructureOfClass {

	//field
	String name = "멤버 변수";
	private int age;
	//var age = 10; 지역변수인 타입 추론 변수는 사용 할 수 없다. 
	
	//cons 
	public Sample01_StructureOfClass() {
		// TODO Auto-generated constructor stub
	}
	
	//method 
	public void sayHello() {
		var friend = "친구야";
		System.out.printf("%s 안녕\n", friend);
	}
	
	public void sayHello(String friend) {
		System.out.printf("%s 안녕\n", friend);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;	//필드와 매개변수가 동일 할 때 this 로 구분한다.
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
