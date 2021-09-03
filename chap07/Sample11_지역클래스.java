package chap07;

public class Sample11_지역클래스 {
	void localMethod() {
		int age = 23;
		class LocalClass {
			public void howOldAreYou() {
				System.out.printf("빵형은 %d 살", age);
			}
		}
		
		LocalClass innerClass = new LocalClass();
		innerClass.howOldAreYou();
	}
	
	
	public static void main(String[] args) {
		Sample11_지역클래스 smp = new Sample11_지역클래스();
		smp.localMethod();
	}
}
