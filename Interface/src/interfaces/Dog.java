package interfaces;

/**
 * This class implements the Animal interface, representing a Dog.
 * It provides specific implementations for the makeSound and move methods.
 * 
 * @author C SANDEEP AITHAL
 */
public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("The Dog Barks");
    }

    @Override
    public void move() {
        System.out.println("The Dog runs");
    }
}
