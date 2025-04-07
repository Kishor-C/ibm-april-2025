package com.ibm;
interface Vehicle {
	void mileage();
	void wheels();
}
abstract class Bike implements Vehicle {	
	
	@Override
	public void wheels() {
		System.out.println("2 wheeler");
	}
}
class Rx extends Bike {
	@Override
	public void mileage() {
		System.out.println("Rx mileage: 40kmpl");
	}
}
public class TestAbstract {
	public static void main(String[] args) {
		print(new Rx());
	}
	static void print(Vehicle veh) {
		veh.mileage();
		veh.wheels();
		System.out.println("________________________________");
	}
}
