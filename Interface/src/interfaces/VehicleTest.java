package interfaces;

/**
 * Test class for Vehicle interface.
 * 
 * @author C SANDEEP AITHAL
 */
public class VehicleTest {
    
    /**
     * The main method to test the Vehicle functionality.
     * 
     */
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
    }
}
