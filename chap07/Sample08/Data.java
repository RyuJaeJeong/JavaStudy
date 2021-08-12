package chap07.Sample08;

public class Data {
	
	String name;
	int age;
	
	
	public Data() {
		System.out.println("Data 초기화합니다.");
		this.name = "재정";
		this.age = 27;		
	}

	/**
	 * 생성자는 1개 이상 만들 수 있습니다.
	 * @param name
	 * @param age
	 */
	public Data(String name, int age) {
		System.out.println("Data 초기화합니다.");
		this.name = name;
		this.age = age;		
	}
	
	
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
	}
	
	

}
