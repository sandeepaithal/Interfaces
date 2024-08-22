package interfaces;

/**
 * Test class for the Employee interface. Demonstrates the calculation of
 * salaries for different types of employees.
 * 
 * @author C SANDEEP AITHAL
 */

public class EmployeeTest {
	/**
	 * The main method to test the functionality of different Employee
	 * implementations.
	 */

	public static void main(String[] args) {
		Employee employee = new FullTimeEmployee(60000);
		System.out.println("Full-Time Employee Monthly Salary: $" + employee.calculateSalary());

		

	}
}
