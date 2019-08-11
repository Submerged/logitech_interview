/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author derekleblanc
 */
public class OrganizationalChartTest {
    
    public OrganizationalChartTest() {
    }
    
    @Test
    public void testNullRoot() {
        assertThrows(IllegalArgumentException.class, () -> {
            OrganizationalChart myOrganization = new OrganizationalChart(null);
        });
    }
    /**
     * Test of addEmployee method, of class OrganizationChart.
     */
    @Test
    public void testEmployeeBoss() {
        Employee genericCEO = new Employee(35, "0000-00", "Last", "John", "Canada", "BC", "123 White ST", "V6P 3E9", null);
        OrganizationalChart myOrganization = new OrganizationalChart(genericCEO);
        
        Employee genericEmployee = new Employee(35, "0000-01", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9", null);
        myOrganization.addEmployee(genericEmployee, "John");
        
        Employee benedictEmployee = myOrganization.getEmployeeByGivenName("Benedict");
        assertEquals("John", benedictEmployee.getCurrentBoss().getGivenName());
    }

    /**
     * Test of getEmployeeByGivenName method, of class OrganizationChart.
     */
    @Test
    public void testGetEmployeeByGivenName() {
        Employee genericCEO = new Employee(35, "0000-00", "Last", "John", "Canada", "BC", "123 White ST", "V6P 3E9", null);
        OrganizationalChart myOrganization = new OrganizationalChart(genericCEO);
        
        Employee genericEmployee = new Employee(35, "0000-01", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9", null);
        myOrganization.addEmployee(genericEmployee, "John");
        
        Employee genericEmployeeFound = myOrganization.getEmployeeByGivenName("Benedict");
        assertEquals("Benedict", genericEmployee.getGivenName());
        assertEquals("0000-01", genericEmployee.getEmployeeID());
    }

    /**
     * Test of getEmployeeCount method, of class OrganizationChart.
     */
    @Test
    public void testGetEmployeeCount() {
        Employee ceoEmployee = new Employee(35, "0000-00", "Last", "John", "Canada", "BC", "123 White ST", "V6P 3E9", null);
        Employee genericEmployee1 = new Employee(35, "0000-01", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9", null);
        Employee genericEmployee2 = new Employee(35, "0000-02", "Last", "Marty", "Canada", "BC", "123 White ST", "V6P 3E9", null);
        Employee genericEmployee3 = new Employee(35, "0000-03", "Last", "Ruth", "Canada", "BC", "123 White ST", "V6P 3E9", null);
        OrganizationalChart myOrganization = new OrganizationalChart(ceoEmployee);
        myOrganization.addEmployee(genericEmployee1, "John");
        myOrganization.addEmployee(genericEmployee2, "Benedict");
        myOrganization.addEmployee(genericEmployee3, "Marty");
        
        assertEquals(4, myOrganization.getEmployeeCount());
    }
    
}
