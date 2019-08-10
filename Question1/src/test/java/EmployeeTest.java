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
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    /**
     * Test of getAge method, of class Employee.
     */
    @Test
    public void testGetAge() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        assertEquals(35, genericEmployee.getAge());
    }

    /**
     * Test of setAge method, of class Employee.
     */
    @Test
    public void testSetAge() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        genericEmployee.setAge(40);
        assertEquals(40, genericEmployee.getAge());
    }

    /**
     * Test of getEmployeeID method, of class Employee.
     */
    @Test
    public void testGetEmployeeID() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        assertEquals("0000-01", genericEmployee.getEmployeeID());
    }

    /**
     * Test of setEmployeeID method, of class Employee.
     */
    @Test
    public void testSetEmployeeID() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        genericEmployee.setEmployeeID("0000-02");
        assertEquals("0000-02", genericEmployee.getEmployeeID());
    }

    /**
     * Test of getFamilyName method, of class Employee.
     */
    @Test
    public void testGetFamilyName() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        assertEquals("Leblanc", genericEmployee.getFamilyName());
    }

    /**
     * Test of setFamilyName method, of class Employee.
     */
    @Test
    public void testSetFamilyName() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        genericEmployee.setFamilyName("White");
        assertEquals("White", genericEmployee.getFamilyName());
    }

    /**
     * Test of getGivenName method, of class Employee.
     */
    @Test
    public void testGetGivenName() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        assertEquals("Derek", genericEmployee.getGivenName());
    }

    /**
     * Test of setGivenName method, of class Employee.
     */
    @Test
    public void testSetGivenName() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        genericEmployee.setGivenName("Darren");
        assertEquals("Darren", genericEmployee.getGivenName());
    }

    /**
     * Test of getCountry method, of class Employee.
     */
    @Test
    public void testGetCountry() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        assertEquals("Canada", genericEmployee.getEmployeeID());
    }

    /**
     * Test of setCountry method, of class Employee.
     */
    @Test
    public void testSetCountry() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        genericEmployee.setCountry("United States");
        assertEquals("United States", genericEmployee.getEmployeeID());
    }

    /**
     * Test of getGeographicRegion method, of class Employee.
     */
    @Test
    public void testGetGeographicRegion() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        assertEquals("BC", genericEmployee.getCountry());
    }

    /**
     * Test of setGeographicRegion method, of class Employee.
     */
    @Test
    public void testSetGeographicRegion() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        genericEmployee.setGeographicRegion("NS");
        assertEquals("NS", genericEmployee.getEmployeeID());
    }

    /**
     * Test of getAddress method, of class Employee.
     */
    @Test
    public void testGetAddress() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        assertEquals("1373 West 73rd AVE", genericEmployee.getAddress());
    }

    /**
     * Test of setAddress method, of class Employee.
     */
    @Test
    public void testSetAddress() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        genericEmployee.setAddress("123-1000 Burnaby ST");
        assertEquals("123-1000 Burnaby ST", genericEmployee.getAddress());
    }

    /**
     * Test of getPostalCode method, of class Employee.
     */
    @Test
    public void testGetPostalCode() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        assertEquals("V6P 3E9", genericEmployee.getPostalCode());
    }

    /**
     * Test of setPostalCode method, of class Employee.
     */
    @Test
    public void testSetPostalCode() {
        Employee genericEmployee = new Employee(35, "0000-01", "Leblanc", "Derek", "Canada", "BC", "1373 West 73rd AVE", "V6P3E9", null, null);
        genericEmployee.setPostalCode("L4N 6V5");
        assertEquals("L4N 6V5", genericEmployee.getPostalCode());
    }
    
}
