/**
 *
 * @author Derek Leblanc
 * @date August 11 / 2019
 * @description Test cases for Employee Registry class
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author derekleblanc
 */
public class EmployeeRegistryTest {
    
    public EmployeeRegistryTest() {
    }
    
    @Test
    public void testNullRoot() {
        assertThrows(IllegalArgumentException.class, () -> {
            EmployeeRegistry myOrganization = new EmployeeRegistry(null);
        });
    }
    /**
     * Test of addEmployee method, of class EmployeeRegisty.
     */
    @Test
    public void testEmployeeBoss() {
        Employee genericCEO = new Employee(35, "0000-00", "Last", "John", "Canada", "BC", "123 White ST", "V6P 3E9");
        EmployeeRegistry employeeRegistry = new EmployeeRegistry(genericCEO);
        
        Employee genericEmployee = new Employee(35, "0000-01", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9");
        employeeRegistry.addEmployee(genericEmployee, "John");
        
        Employee benedictEmployee = employeeRegistry.getEmployeeByGivenName("Benedict");
        assertEquals("John", benedictEmployee.getCurrentBoss().getGivenName());
    }

    /**
     * Test of getEmployeeByGivenName method, of class EmployeeRegisty.
     */
    @Test
    public void testGetEmployeeByGivenName() {
        Employee genericCEO = new Employee(35, "0000-00", "Last", "John", "Canada", "BC", "123 White ST", "V6P 3E9");
        EmployeeRegistry employeeRegistry = new EmployeeRegistry(genericCEO);
        
        Employee genericEmployee = new Employee(35, "0000-01", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9");
        employeeRegistry.addEmployee(genericEmployee, "John");
        
        Employee genericEmployeeFound = employeeRegistry.getEmployeeByGivenName("Benedict");
        assertEquals("Benedict", genericEmployee.getGivenName());
        assertEquals("0000-01", genericEmployee.getEmployeeID());
    }

    /**
     * Test of getEmployeeCount method, of class EmployeeRegisty.
     */
    @Test
    public void testGetEmployeeCount() {
        Employee ceoEmployee = new Employee(35, "0000-00", "Last", "John", "Canada", "BC", "123 White ST", "V6P 3E9");
        Employee genericEmployee1 = new Employee(35, "0000-01", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9");
        Employee genericEmployee2 = new Employee(35, "0000-02", "Last", "Marty", "Canada", "BC", "123 White ST", "V6P 3E9");
        Employee genericEmployee3 = new Employee(35, "0000-03", "Last", "Ruth", "Canada", "BC", "123 White ST", "V6P 3E9");
        EmployeeRegistry employeeRegistry = new EmployeeRegistry(ceoEmployee);
        employeeRegistry.addEmployee(genericEmployee1, "John");
        employeeRegistry.addEmployee(genericEmployee2, "Benedict");
        employeeRegistry.addEmployee(genericEmployee3, "Marty");
        
        assertEquals(4, employeeRegistry.getEmployeeCount());
    }
    
    /**
     * Test of adding a duplicate employee of class EmployeeRegisty
     */
    @Test
    public void testAddDuplicateEmployee() {
        Employee genericCEO = new Employee(35, "0000-00", "Last", "John", "Canada", "BC", "123 White ST", "V6P 3E9");
        EmployeeRegistry employeeRegistry = new EmployeeRegistry(genericCEO);
        
        Employee genericEmployee = new Employee(35, "0000-01", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9");
        employeeRegistry.addEmployee(genericEmployee, "John");
        assertThrows(IllegalArgumentException.class, () -> {
            //Try adding employee again with same credentials
            employeeRegistry.addEmployee(genericEmployee, "John");
        });
        
    }
}
