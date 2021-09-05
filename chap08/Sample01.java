package chap08;

public class Sample01 {
	public static void main(String[] args) {
		ElectricCar car1 = new ElectricCar("red", "kia");
		car1.printInfo();
		System.out.println("=====================");
		GasolineCar car2 = new GasolineCar("blue", "Hyundai");
		car2.printInfo();
	}
}
