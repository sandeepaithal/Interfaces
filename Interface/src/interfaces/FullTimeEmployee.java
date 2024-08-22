package interfaces;

/**
 * Implementation of the Employee interface for full-time employees.
 * 
 * @author C SANDEEP AITHAL
 */
public class FullTimeEmployee implements Employee {

    private double annualSalary;

    /**
     * Constructs a FullTimeEmployee with the specified annual salary.
     */
    public FullTimeEmployee(double annualSalary) {
        this.annualSalary = annualSalary;
    }


	@Override
    public double calculateSalary() {
        return annualSalary / 12;
    }
}
