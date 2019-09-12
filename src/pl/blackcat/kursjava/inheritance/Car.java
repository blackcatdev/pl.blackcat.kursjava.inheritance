package pl.blackcat.kursjava.inheritance;

public class Car extends Vehicle {
	public void startEngine() {
		super.startEngine();
		System.out.println("Force driver to fasten seat belts.");
	}

}
