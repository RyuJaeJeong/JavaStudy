package chap08;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Car {
	protected String color;
	protected String manufacturer;
	
	public abstract String fillup(); //휘발유, 등유, 전기를 넣습니다. 
	
	public void printInfo() {
		System.out.printf("이 차의 색은 %s 입니다.\n", color);
		System.out.println("이 차는 " + fillup());
		System.out.printf("이 차는 %s 에서 생산합니다.\n", manufacturer);
	}
	
	
}
