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
public class OrganizationChartTest {
    
    public OrganizationChartTest() {
    }
    
    @Test
    public void testNullRoot() {
        assertThrows(IllegalArgumentException.class, () -> {
            OrganizationChart myOrganization = new OrganizationChart(null);
        });
    }
    /**
     * Test of addEmployee method, of class OrganizationChart.
     */
    @Test
    public void testEmployeeBoss() {
        Employee genericCEO = new Employee(35, "0000-00", "Last", "CEO", "Canada", "BC", "123 White ST", "V6P 3E9", null, null);
        Employee genericEmployee = new Employee(35, "0000-01", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9", null, null);
        OrganizationChart myOrganization = new OrganizationChart(genericCEO);
        myOrganization.addEmployee(genericEmployee, "Michael");
        
        Employee genericEmployeeFound = myOrganization.getEmployeeByGivenName("Benedict");
        assertEquals("Michael", genericEmployee.getCurrentBoss().getGivenName());
    }

    /**
     * Test of getEmployeeByGivenName method, of class OrganizationChart.
     */
    @Test
    public void testGetEmployeeByGivenName() {
        Employee genericCEO = new Employee(35, "0000-00", "Last", "CEO", "Canada", "BC", "123 White ST", "V6P 3E9", null, null);
        Employee genericEmployee = new Employee(35, "0000-01", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9", null, null);
        OrganizationChart myOrganization = new OrganizationChart(genericCEO);
        myOrganization.addEmployee(genericEmployee, "Michael");
        
        Employee genericEmployeeFound = myOrganization.getEmployeeByGivenName("Benedict");
        assertEquals("Benedict", genericEmployee.getGivenName());
        assertEquals("0000-01", genericEmployee.getEmployeeID());
    }

    /**
     * Test of getEmployeeCount method, of class OrganizationChart.
     */
    @Test
    public void testGetEmployeeCount() {
        Employee genericCEO = new Employee(35, "0000-00", "Last", "CEO", "Canada", "BC", "123 White ST", "V6P 3E9", null, null);
        Employee genericEmployee1 = new Employee(35, "0000-01", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9", null, null);
        Employee genericEmployee2 = new Employee(35, "0000-02", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9", null, null);
        Employee genericEmployee3 = new Employee(35, "0000-03", "Last", "Benedict", "Canada", "BC", "123 White ST", "V6P 3E9", null, null);
        OrganizationChart myOrganization = new OrganizationChart(genericCEO);
        myOrganization.addEmployee(genericEmployee1, "Michael");
        myOrganization.addEmployee(genericEmployee1, "Ruth");
        myOrganization.addEmployee(genericEmployee1, "Jane");
        
        assertEquals(4, myOrganization.getEmployeeCount());
    }
    
}
