package interfaces;

/**
 * Test class for the Shape interface.
 * Demonstrates the usage of the Circle implementation.
 * 
 * @author C SANDEEP AITHAL
 */
public class ShapeTest {

    /**
     * The main method to test the functionality of the Shape interface
     * using a Circle object.
     */
    public static void main(String[] args) {
        Shape shape = new Circle(5.0);
        shape.draw();
        System.out.println("Area: " + shape.calculateArea());
    }
}
