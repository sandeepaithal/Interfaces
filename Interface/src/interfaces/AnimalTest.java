package interfaces;

/**
 * Test class for Animal interface.
 * 
 * @author C SANDEEP AITHAL
 */
public class AnimalTest {

    /**
     * The main method to test the Animal functionality.
     */
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        animal.move();
    }
}
