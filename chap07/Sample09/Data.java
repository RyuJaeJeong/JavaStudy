package chap07.Sample09;

public class Data {
	
	String name;
	int age;
	
	
	public Data() {
		this("무명", 0);
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
