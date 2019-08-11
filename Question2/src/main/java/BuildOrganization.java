/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derekleblanc
 */
public class BuildOrganization {
    public static void main(String args[]) {
        //Top Down approach to organizational structure creation -- Starting with the CEO
        Employee organizationCEO = new Employee(40, "0000-00", "Last", "John", "Canada", "BC", "123 White ST", "V6P 3E9", null);
        OrganizationalChart myOrganization = new OrganizationalChart(organizationCEO);
        
        Employee employeeMary = new Employee(56, "0000-01", "Last", "Mary", "Canada", "BC", "123 Brown ST", "V6P 3E9", null);
        Employee employeePeter = new Employee(70, "0000-02", "Last", "Peter", "Canada", "BC", "123 Yellow ST", "V6P 3E9", null);
        Employee employeeMichael = new Employee(21, "0000-03", "Last", "Michael", "Canada", "BC", "123 Orange ST", "V6P 3E9", null);
        
        myOrganization.addEmployee(employeeMary, "John");
        myOrganization.addEmployee(employeePeter, "John");
        myOrganization.addEmployee(employeeMichael, "John");
        
        //Mary Subordinates 
        Employee employeeSam = new Employee(35, "0000-04", "Last", "Sam", "Canada", "BC", "123 Salmon ST", "V6P 3E9", null);
        Employee employeeWill = new Employee(45, "0000-05", "Last", "Will", "Canada", "BC", "123 Mustard ST", "V6P 3E9", null);
        
        myOrganization.addEmployee(employeeSam, "Mary");
        myOrganization.addEmployee(employeeWill, "Mary");
        
        //Will Subordinates
        Employee employeeJackie = new Employee(56, "0000-06", "Last", "Jackie", "Canada", "BC", "123 Blue ST", "V6P 3E9", null);
        Employee employeeFrank = new Employee(49, "0000-07", "Last", "Frank", "Canada", "BC", "123 Green ST", "V6P 3E9", null);
        myOrganization.addEmployee(employeeJackie, "Will");
        myOrganization.addEmployee(employeeFrank, "Will");
        
        
        //Output current reports of an employee
        myOrganization.getEmployeeByGivenName("Mary").setGivenName("Mary-Anne");
        myOrganization.getEmployeeByGivenName("Mary").printSubordinates();
        
        
        
    }
}
