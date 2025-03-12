package com.akib.car_engine_specification;

public class User {
	public static void main(String[] args) {
		MockSuccessEngine start = new MockSuccessEngine();
		MockFailAndRetryEngine faild = new MockFailAndRetryEngine();
		MockServicingEngine service = new MockServicingEngine();

		Car carOne = new Car(start);
		Car carTwo = new Car(faild);
		Car carThree = new Car(service);

		carOne.drive(start.mode());
		carTwo.drive(faild.mode());
		carThree.drive(service.mode());

	}
}
