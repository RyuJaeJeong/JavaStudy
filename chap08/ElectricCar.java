package chap08;

public class ElectricCar extends Car {

	public ElectricCar(String color, String manufacturer) {
		super(color, manufacturer);
	}

	@Override
	public String fillup() {
		return "전기를 충전합니다.";
	}

}
