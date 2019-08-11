/**
 *
 * @author Derek Leblanc
 * @date August 11 / 2019
 * @description Test cases for Employee class
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author derekleblanc
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    /**
     * Test of getAge method, of class Employee.
     */
    @Test
    public void testGetAge() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        assertEquals(35, genericEmployee.getAge());
    }

    /**
     * Test of setAge method, of class Employee.
     */
    @Test
    public void testSetAge() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        genericEmployee.setAge(40);
        assertEquals(40, genericEmployee.getAge());
    }

    /**
     * Test of setAge method to make sure an error is thrown on the high end of being out of bounds
     */
    @Test
    public void testSetAgeHigh() {
        assertThrows(IllegalArgumentException.class, () -> {
            Employee genericEmployee = new Employee(111, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        });
    }
    
    /**
     * Test of setAge method to make sure an error is thrown on the high end of being out of bounds
     */
    @Test
    public void testSetAgeLow() {
        assertThrows(IllegalArgumentException.class, () -> {
            Employee genericEmployee = new Employee(14, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        });
    }
    
    /**
     * Test of setAge method to make sure an error is thrown on the high end of being out of bounds
     */
    @Test
    public void testSetAgeNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Employee genericEmployee = new Employee(-10, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        });
    }
    /**
     * Test of getEmployeeID method, of class Employee.
     */
    @Test
    public void testGetEmployeeID() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        assertEquals("0000-01", genericEmployee.getEmployeeID());
    }

    /**
     * Test of setEmployeeID method, of class Employee.
     */
    @Test
    public void testSetEmployeeID() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        genericEmployee.setEmployeeID("0000-02");
        assertEquals("0000-02", genericEmployee.getEmployeeID());
    }

    /**
     * Test of getFamilyName method, of class Employee.
     */
    @Test
    public void testGetFamilyName() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        assertEquals("Leblanc", genericEmployee.getFamilyName());
    }

    /**
     * Test of setFamilyName method, of class Employee.
     */
    @Test
    public void testSetFamilyName() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        genericEmployee.setFamilyName("White");
        assertEquals("White", genericEmployee.getFamilyName());
    }

    /**
     * Test of getGivenName method, of class Employee.
     */
    @Test
    public void testGetGivenName() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        assertEquals("Derek", genericEmployee.getGivenName());
    }

    /**
     * Test of getCountry method, of class Employee.
     */
    @Test
    public void testGetCountry() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        assertEquals("Canada", genericEmployee.getCountry());
    }

    /**
     * Test of setCountry method, of class Employee.
     */
    @Test
    public void testSetCountry() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        genericEmployee.setCountry("United States");
        assertEquals("United States", genericEmployee.getCountry());
    }

    /**
     * Test of getGeographicRegion method, of class Employee.
     */
    @Test
    public void testGetGeographicRegion() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        assertEquals("BC", genericEmployee.getGeographicRegion());
    }

    /**
     * Test of setGeographicRegion method, of class Employee.
     */
    @Test
    public void testSetGeographicRegion() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        genericEmployee.setGeographicRegion("NS");
        assertEquals("NS", genericEmployee.getGeographicRegion());
    }

    /**
     * Test of getAddress method, of class Employee.
     */
    @Test
    public void testGetAddress() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        assertEquals("1373 West 73rd AVE", genericEmployee.getAddress());
    }

    /**
     * Test of setAddress method, of class Employee.
     */
    @Test
    public void testSetAddress() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        genericEmployee.setAddress("123-1000 Burnaby ST");
        assertEquals("123-1000 Burnaby ST", genericEmployee.getAddress());
    }

    /**
     * Test of getPostalCode method, of class Employee.
     */
    @Test
    public void testGetPostalCode() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        assertEquals("V6P3E9", genericEmployee.getPostalCode());
    }

    /**
     * Test of setPostalCode method, of class Employee.
     */
    @Test
    public void testSetPostalCode() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        genericEmployee.setPostalCode("L4N 6V5");
        assertEquals("L4N 6V5", genericEmployee.getPostalCode());
    }
    
    /**
     * Test of null instantiation of class Employee.
     */
    @Test
    public void testNullInstantiation() {
        assertThrows(NullPointerException.class, () -> {
            Employee genericEmployee = new Employee(35, null, "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        });
        
        assertThrows(NullPointerException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", null, "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        });
        
        assertThrows(NullPointerException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "Leblanc", null, "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        });
        
        assertThrows(NullPointerException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "Leblanc", "Derek", null, "BC", "1373 West 73rd AVE", "V6P3E9");
        });
        
        assertThrows(NullPointerException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "Leblanc", "Derek", "Canada", null, "1373 West 73rd AVE", "V6P3E9");
        });
        
        assertThrows(NullPointerException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "Leblanc", "Derek", "Canada", "BC", null, "V6P3E9");
        });
        
        assertThrows(NullPointerException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "Leblanc", "Derek", "Canada", "BC", "123 Street", null);
        });
        
    }
    
    /**
     * Test of null instantiation of class Employee.
     */
    @Test
    public void testEmptyInstantiation() {
        assertThrows(IllegalArgumentException.class, () -> {
            Employee genericEmployee = new Employee(35, "", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "Leblanc", "", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "Leblanc", "Derek", "", "BC", "1373 West 73rd AVE", "V6P3E9");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "Leblanc", "Derek", "Canada", "", "1373 West 73rd AVE", "V6P3E9");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "Leblanc", "Derek", "Canada", "BC", "", "V6P3E9");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            Employee genericEmployee = new Employee(35, "0000-00", "Leblanc", "Derek", "Canada", "BC", "123 Street", "");
        });
        
    }
    
}
