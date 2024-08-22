package interfaces;

/**
 * Implementation of the Shape interface for a Circle.
 * Represents a circle with a specified radius.
 * 
 * @author C SANDEEP AITHAL
 */
public class Circle implements Shape {

    private double radius;

    /**
     * Constructs a Circle with the specified radius.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Draws the circle.
     */
    @Override
    public void draw() {
        System.out.println("The circle is drawn with a radius of: " + radius);
    }

    /**
     * Calculates the area of the circle.
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
