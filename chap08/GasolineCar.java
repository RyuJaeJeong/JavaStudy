package chap08;

public class GasolineCar extends Car {

	public GasolineCar(String color, String manufacturer) {
		super(color, manufacturer);
		
	}

	@Override
	public String fillup() {
		return "휘발유를 주유합니다.";
	}

}
