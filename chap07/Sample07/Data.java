package chap07.Sample07;

public class Data {
	
	String name;
	int age;
	
	
	public Data() {
		System.out.println("Data 초기화합니다.");
		this.name = "재정";
		this.age = 27;		
	}


	
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
	}
	
	

}
