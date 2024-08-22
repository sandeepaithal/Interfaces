package interfaces;
/**
 * This class implements the Vehicle interface, representing a Car.
 * It provides specific implementations for the start and stop methods.
 * 
 * @author C SANDEEP AITHAL
 */

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("The Car Started");
		
	}

	@Override
	public void stop() {
		System.out.println("The Car stopped");
		
	}

}
